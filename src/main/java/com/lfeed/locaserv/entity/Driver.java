package com.lfeed.locaserv.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Table(name="drivers")
public class Driver {
    @Id
    private Long id;
    private String employeeId;
    private String name;
    private String cpf;
}
