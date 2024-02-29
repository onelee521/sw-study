package com.ohgiraffers.springdatajpa.common;

import org.springframework.data.domain.Page;

public class Pagination {

    /* 설명. PagingButtonInfo를 생성해서 (버튼 생성에 필요한 정보들 생성) */
    public static PagingButtonInfo getPagingButtonInfo(Page page) {

        /* 설명. 이 때 매개변수로 넘어오는 Page 객체는 인덱스 개념을 가지고 있다. */
        int currentPage = page.getNumber() + 1;    // 인덱스 개념 -> 실제 페이지 번호의 개념으로 다시 변경
        int defaultButtonCount = 10;               // 한 페이지에 보일 버튼 최대 갯수
        int startPage;                             // 한 페이지에 보여질 첫 버튼
        int endPage;                               // 한 페이지에 보여질 마지막 버튼

        startPage = (int)(Math.ceil((double) currentPage / defaultButtonCount) - 1) * defaultButtonCount + 1;
        endPage = startPage + defaultButtonCount - 1;

        /* 설명. 예외 부분에 대한 처리부분 */
        if(page.getTotalPages() < endPage)
            endPage = page.getTotalPages();

        if (page.getTotalPages() == 0) {
            endPage = startPage;
        }


        return new PagingButtonInfo(currentPage, startPage, endPage);
    }
}
