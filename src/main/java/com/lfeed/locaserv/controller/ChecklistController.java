package com.lfeed.locaserv.controller;

import com.lfeed.locaserv.dtos.ChecklistAnswers;
import com.lfeed.locaserv.entity.Checklist;
import com.lfeed.locaserv.services.ChecklistService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

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

    @PostMapping
    public ResponseEntity<Mono<ChecklistAnswers>> saveChecklist(@RequestBody ChecklistAnswers checklistAnswers) {
        return ResponseEntity.ok(Mono.just(checklistAnswers));
    }
}
