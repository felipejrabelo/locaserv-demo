package com.lfeed.locaserv.repository;

import com.lfeed.locaserv.entity.Driver;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface DriversRepository extends ReactiveCrudRepository<Driver, Long> {
}
