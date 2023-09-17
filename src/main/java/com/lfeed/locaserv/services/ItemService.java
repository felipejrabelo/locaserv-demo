package com.lfeed.locaserv.services;

import com.lfeed.locaserv.dtos.ItemDto;
import com.lfeed.locaserv.mappers.ItemMapper;
import com.lfeed.locaserv.repository.ItemRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class ItemService {

    private final ItemRepository itemRepository;

    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public Flux<ItemDto> getAll(){
        return this.itemRepository.findAll().map(ItemMapper::mapToItemDto);
    }

}
