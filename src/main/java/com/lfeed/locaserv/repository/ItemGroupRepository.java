package com.lfeed.locaserv.repository;

import com.lfeed.locaserv.entity.ItemGroup;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface ItemGroupRepository extends ReactiveCrudRepository<ItemGroup, Long> {
}
