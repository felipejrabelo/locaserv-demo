package com.lfeed.locaserv.repository;

import com.lfeed.locaserv.entity.Checklist;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface ChecklistRepository extends ReactiveCrudRepository<Checklist, Long> {
}
