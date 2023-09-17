package com.lfeed.locaserv.services;

import com.lfeed.locaserv.entity.ItemGroup;
import com.lfeed.locaserv.repository.ItemGroupRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class ItemGroupService {

    private final ItemGroupRepository itemGroupRepository;

    public ItemGroupService(ItemGroupRepository itemGroupRepository) {
        this.itemGroupRepository = itemGroupRepository;
    }

    public Flux<ItemGroup> getAll(){
        return this.itemGroupRepository.findAll();
    }

}
