package com.lfeed.locaserv.services;

import com.lfeed.locaserv.entity.Veiculo;
import com.lfeed.locaserv.repository.VeiculosRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
@Service
public class VeiculoService {

    private final VeiculosRepository veiculosRepository;

    public VeiculoService(VeiculosRepository veiculosRepository) {
        this.veiculosRepository = veiculosRepository;
    }

    public Flux<Veiculo> getAll(){
        return this.veiculosRepository.findAll();
    }
}
