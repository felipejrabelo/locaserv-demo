package com.lfeed.locaserv.controller;

import com.lfeed.locaserv.entity.ItemGroup;
import com.lfeed.locaserv.entity.Veiculo;
import com.lfeed.locaserv.services.VeiculoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/veiculos")
public class VeiculoController {

    private final VeiculoService veiculoService;

    public VeiculoController(VeiculoService veiculoService) {
        this.veiculoService = veiculoService;
    }

    @GetMapping
    public ResponseEntity<Flux<Veiculo>> getVeiculos() {
        return ResponseEntity.ok(this.veiculoService.getAll());
    }
}
