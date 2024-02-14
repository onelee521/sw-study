package com.ohgiraffers.common;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private final List<Product> items;      // 초기화를 안하면 에러가 뜸, 원래 물건을 담아논 곳에서 물건이 바뀌면 안되기 때문(쇼핑카트가 바뀌는 것x)

    public ShoppingCart() {
        items = new ArrayList<>();          // 초기화
    }

    /* 설명. 카트에 물품을 담는 기능 */
    public void addItem(Product item) {
        items.add(item);
    }

    /* 설명. 카트의 물품 꺼내는 기능 */
    public List<Product> getItems() {
        return items;
    }
}
