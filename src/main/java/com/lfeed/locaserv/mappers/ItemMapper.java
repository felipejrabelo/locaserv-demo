package com.lfeed.locaserv.mappers;

import com.lfeed.locaserv.dtos.ItemDto;
import com.lfeed.locaserv.entity.Item;

public class ItemMapper {

    private final static String separator = ";";

    public static ItemDto mapToItemDto(Item item){
        return ItemDto.builder()
                .id(item.getId())
                .idGroup(item.getIdGroup())
                .description(item.getDescription())
                .answers(item.getAnswers().split(separator))
                .details(item.getDetails() != null ? item.getDetails().split(separator) : null)
                .commentLabel(item.getCommentLabel())
                .tip(item.getTip())
                .build();
    }
}
