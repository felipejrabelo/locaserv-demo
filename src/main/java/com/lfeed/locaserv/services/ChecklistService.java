package com.lfeed.locaserv.services;

import com.lfeed.locaserv.entity.Checklist;
import com.lfeed.locaserv.repository.ChecklistItemsReceivedRepository;
import com.lfeed.locaserv.repository.ChecklistReceivedRepository;
import com.lfeed.locaserv.repository.ChecklistRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class ChecklistService {

    private final ChecklistRepository checklistRepository;
    private final ChecklistReceivedRepository checklistReceivedRepository;
    private final ChecklistItemsReceivedRepository checklistItemsReceivedRepository;

    public ChecklistService(ChecklistRepository checklistRepository, ChecklistReceivedRepository checklistReceivedRepository, ChecklistItemsReceivedRepository checklistItemsReceivedRepository) {
        this.checklistRepository = checklistRepository;
        this.checklistReceivedRepository = checklistReceivedRepository;
        this.checklistItemsReceivedRepository = checklistItemsReceivedRepository;
    }

    public Flux<Checklist> getAll(){
        return this.checklistRepository.findAll();
    }

}
