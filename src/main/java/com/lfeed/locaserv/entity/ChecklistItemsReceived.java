package com.lfeed.locaserv.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Table(name="checklist_items_received")
public class ChecklistItemsReceived {
    @Id
    private Long id;
    private Long idChecklistReceived;
    private Long idItem;
    private String isItemOk;
    private String selectedDetails;
    private String commentLabel;
    private String commentResponse;
}
