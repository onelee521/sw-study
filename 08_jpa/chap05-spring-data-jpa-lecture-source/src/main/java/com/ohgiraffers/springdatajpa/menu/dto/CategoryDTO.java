package com.ohgiraffers.springdatajpa.menu.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class CategoryDTO {

    public int categoryCode;
    private String categoryName;
    private Integer refCategoryCode;
}
