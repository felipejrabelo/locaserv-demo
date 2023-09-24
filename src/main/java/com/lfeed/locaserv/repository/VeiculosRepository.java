package com.lfeed.locaserv.repository;

import com.lfeed.locaserv.entity.Veiculo;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface VeiculosRepository extends ReactiveCrudRepository<Veiculo, String> {
}
