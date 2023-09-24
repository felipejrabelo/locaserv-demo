package com.lfeed.locaserv.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Table(name="rotas")
public class Rota {
    @Id
    private Long id;
    @JsonProperty("Rota")
    private String rota;
    @JsonProperty("Motorista")
    private String motorista;
    @JsonProperty("Placa")
    private String placa;
    private String numOrdem;
}
