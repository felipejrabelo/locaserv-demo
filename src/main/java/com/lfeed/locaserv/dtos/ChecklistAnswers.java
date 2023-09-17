package com.lfeed.locaserv.dtos;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ChecklistAnswers {
    private Long idChecklist;
    private String idVehicle;
    private Long odometer;
    private String createdby;
    private List<ChecklistItemResponse> itemsResponses;
}
