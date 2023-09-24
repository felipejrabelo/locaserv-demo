package com.lfeed.locaserv.repository;

import com.lfeed.locaserv.entity.Rota;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface RotasRepository extends ReactiveCrudRepository<Rota, Long> {
}
