package com.lfeed.locaserv.dtos;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class ItemDto {
    private Long id;
    private Long idGroup;
    private String description;
    private String[] answers;
    private String[] details;
    private String commentLabel;
    private String tip;
}
