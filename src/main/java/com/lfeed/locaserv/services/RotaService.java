package com.lfeed.locaserv.services;

import com.lfeed.locaserv.entity.Rota;
import com.lfeed.locaserv.repository.RotasRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RotaService {

    private final RotasRepository repository;

    public RotaService(RotasRepository repository) {
        this.repository = repository;
    }

    public void saveRotas(List<Rota> rotas){
        this.repository.saveAll(rotas).subscribe();
    }
}
