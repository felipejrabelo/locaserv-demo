package com.lfeed.locaserv.repository;

import com.lfeed.locaserv.entity.ChecklistItemsReceived;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface ChecklistItemsReceivedRepository extends ReactiveCrudRepository<ChecklistItemsReceived, Long> {
}
