package com.lfeed.locaserv.services;

import com.lfeed.locaserv.entity.Checklist;
import com.lfeed.locaserv.repository.ChecklistRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class ChecklistService {

    private final ChecklistRepository checklistRepository;

    public ChecklistService(ChecklistRepository checklistRepository) {
        this.checklistRepository = checklistRepository;
    }

    public Flux<Checklist> getAll(){
        return this.checklistRepository.findAll();
    }

}
