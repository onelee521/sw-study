package com.ohgiraffers.springdatajpa.menu.entitiy;

import jakarta.persistence.*;
import lombok.*;

@Entity // 디폴트 엔티티명 클래스와 똑같음, 대소문자 구분, Menu
@Table(name = "tbl_menu")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@ToString
public class Menu {

    @Id
    @Column(name = "menu_code")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int manuCode;

    @Column(name = "menu_name")
    private String menuName;

    @Column(name = "menu_price")
    private int menuPrice;

    @Column(name = "category_code")
    private int categoryCode;

    @Column(name = "orderable_status")
    private String orderableStatus;

}
