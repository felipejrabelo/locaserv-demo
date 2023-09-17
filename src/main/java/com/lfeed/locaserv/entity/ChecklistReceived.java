package com.lfeed.locaserv.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Table(name="checklist_received")
public class ChecklistReceived {
    @Id
    private Long id;
    private Long idChecklist;
    private String idVehicle;
    private Long odometer;
    private String createdby;
    private LocalDateTime createdat;
}
