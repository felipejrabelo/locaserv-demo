package com.lfeed.locaserv.controller;

import com.lfeed.locaserv.entity.Checklist;
import com.lfeed.locaserv.services.ChecklistService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/checklists")
public class ChecklistController {

    private final ChecklistService checklistService;

    public ChecklistController(ChecklistService checklistService) {
        this.checklistService = checklistService;
    }

    @GetMapping
    public ResponseEntity<Flux<Checklist>> getGroups(){
        return ResponseEntity.ok(this.checklistService.getAll());
    }
}
