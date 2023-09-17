package com.lfeed.locaserv.services;

import com.lfeed.locaserv.dtos.ChecklistAnswers;
import com.lfeed.locaserv.entity.Checklist;
import com.lfeed.locaserv.entity.ChecklistItemsReceived;
import com.lfeed.locaserv.entity.ChecklistReceived;
import com.lfeed.locaserv.repository.ChecklistItemsReceivedRepository;
import com.lfeed.locaserv.repository.ChecklistReceivedRepository;
import com.lfeed.locaserv.repository.ChecklistRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class ChecklistService {

    private final ChecklistRepository checklistRepository;
    private final ChecklistReceivedRepository checklistReceivedRepository;
    private final ChecklistItemsReceivedRepository checklistItemsReceivedRepository;

    public ChecklistService(
            ChecklistRepository checklistRepository,
            ChecklistReceivedRepository checklistReceivedRepository,
            ChecklistItemsReceivedRepository checklistItemsReceivedRepository
    ) {
        this.checklistRepository = checklistRepository;
        this.checklistReceivedRepository = checklistReceivedRepository;
        this.checklistItemsReceivedRepository = checklistItemsReceivedRepository;
    }

    public Flux<Checklist> getAll(){
        return this.checklistRepository.findAll();
    }

    public void saveChecklist(ChecklistAnswers checklistAnswers){

        var checklistReceived = ChecklistReceived.builder()
                .idChecklist(checklistAnswers.getIdChecklist())
                .idVehicle(checklistAnswers.getIdVehicle())
                .odometer(checklistAnswers.getOdometer())
                .createdby(checklistAnswers.getCreatedby())
                .createdat(LocalDateTime.now())
                .build();

        this.checklistReceivedRepository.save(checklistReceived).subscribe(ch ->{
            this.checklistItemsReceivedRepository.saveAll(mapAppItemsResponses(checklistAnswers, ch.getId()))
                    .subscribe();
        }, error -> {
            throw new RuntimeException(error.getMessage());
        });
    }

    private List<ChecklistItemsReceived> mapAppItemsResponses(
            ChecklistAnswers checklistAnswers, Long idChecklistReceived){
        var itemsReceivedList = new ArrayList<ChecklistItemsReceived>();
        checklistAnswers.getItemsResponses().forEach(item -> {
            itemsReceivedList.add(
                    ChecklistItemsReceived.builder()
                            .idChecklistReceived(idChecklistReceived)
                            .idItem(item.getIdItem())
                            .isItemOk(item.getIsItemOk())
                            .selectedDetails(item.getSelectedDetails()
                                    .stream().reduce("", (partialString, element) -> {
                                // Generate elements separated by ";"
                                if(partialString.isEmpty()){
                                    return element;
                                }
                                return partialString + ";" + element;
                            }))
                            .commentLabel(item.getCommentLabel())
                            .commentResponse(item.getCommentResponse())
                            .build()
            );
        });
        return itemsReceivedList;
    }

}
