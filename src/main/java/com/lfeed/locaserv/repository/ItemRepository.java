package com.lfeed.locaserv.repository;

import com.lfeed.locaserv.entity.Item;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface ItemRepository extends ReactiveCrudRepository<Item, Long> {
}
