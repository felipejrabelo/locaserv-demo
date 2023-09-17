package com.lfeed.locaserv.dtos;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ChecklistItemResponse {
    private Long idItem;
    private String isItemOk;
    private List<String> selectedDetails;
    private String commentLabel;
    private String commentResponse;
    private Long groupId;
}
