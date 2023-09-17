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
@Table(name="items")
public class Item {
    @Id
    private Long id;
    private Long idGroup;
    private String description;
    private String answers;
    private String details;
    private String commentLabel;
    private String tip;
}
