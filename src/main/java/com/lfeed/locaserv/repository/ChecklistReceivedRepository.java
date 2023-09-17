package com.lfeed.locaserv.repository;

import com.lfeed.locaserv.entity.ChecklistReceived;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface ChecklistReceivedRepository extends ReactiveCrudRepository<ChecklistReceived, Long> {
}
