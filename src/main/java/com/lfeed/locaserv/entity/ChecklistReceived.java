package com.lfeed.locaserv.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name="checklist_received")
public class ChecklistReceived {
    @Id
    private Long id;
    private Long idChecklist;
    private String idVehicle;
    private Long odometer;
    private String createdBy;
    private String createdAt;
}
