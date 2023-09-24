package com.lfeed.locaserv.controller;

import com.lfeed.locaserv.entity.Driver;
import com.lfeed.locaserv.services.DriverService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/drivers")
public class DriverController {

    private final DriverService driverService;

    public DriverController(DriverService driverService) {
        this.driverService = driverService;
    }

    @GetMapping
    public ResponseEntity<Flux<Driver>> getDrivers(){
        return ResponseEntity.ok(this.driverService.getAll());
    }
}
