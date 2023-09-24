package com.lfeed.locaserv.services;

import com.lfeed.locaserv.entity.Driver;
import com.lfeed.locaserv.repository.DriversRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class DriverService {

    private final DriversRepository driversRepository;

    public DriverService(DriversRepository driversRepository) {
        this.driversRepository = driversRepository;
    }

    public Flux<Driver> getAll(){
        return this.driversRepository.findAll();
    }
}
