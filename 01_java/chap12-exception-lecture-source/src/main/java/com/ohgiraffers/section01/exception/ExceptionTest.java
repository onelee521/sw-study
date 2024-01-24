package com.ohgiraffers.section01.exception;

public class ExceptionTest {
    public void checkEnoughMoney(int price, int money) throws Exception {
        System.out.println("가지고 계신 돈은" + money + "원 입니다.");

        if(money >= price) {
            System.out.println(price + "원 상품을 사기위한 금액이 충분합니다.");
        } else {        //예외상황
            throw new Exception("물건을 살 수 없습니다.");
        }
    }
}
