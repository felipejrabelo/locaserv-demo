package com.lfeed.locaserv.controller;

import com.lfeed.locaserv.entity.Rota;
import com.lfeed.locaserv.services.RotaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rotas")
public class RotaController {

    private final RotaService rotaService;

    public RotaController(RotaService rotaService) {
        this.rotaService = rotaService;
    }

    @PostMapping
    public ResponseEntity<List<Rota>> saveRotas(@RequestBody List<Rota> rotas){
        this.rotaService.saveRotas(rotas);
        return ResponseEntity.ok(rotas);
    }

}
