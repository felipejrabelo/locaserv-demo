package com.lfeed.locaserv.controller;

import com.lfeed.locaserv.dtos.ItemDto;
import com.lfeed.locaserv.services.ItemService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/items")
public class ItemController {

    private final ItemService itemService;

    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @GetMapping
    public ResponseEntity<Flux<ItemDto>> getGroups(){
        return ResponseEntity.ok(this.itemService.getAll());
    }
}
