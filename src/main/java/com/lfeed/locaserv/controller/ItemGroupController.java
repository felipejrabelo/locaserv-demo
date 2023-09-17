package com.lfeed.locaserv.controller;

import com.lfeed.locaserv.entity.ItemGroup;
import com.lfeed.locaserv.services.ItemGroupService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/groups")
public class ItemGroupController {
    private final ItemGroupService itemGroupService;

    public ItemGroupController(ItemGroupService itemGroupService) {
        this.itemGroupService = itemGroupService;
    }

    @GetMapping
    public ResponseEntity<Flux<ItemGroup>> getGroups(){
        return ResponseEntity.ok(itemGroupService.getAll());
    }
}
