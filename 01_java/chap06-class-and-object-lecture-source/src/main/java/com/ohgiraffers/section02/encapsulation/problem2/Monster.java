package com.ohgiraffers.section02.encapsulation.problem2;

public class Monster {
//    String name;
//    int hp;

    /* 설명. 필드의 변수명이 바뀌었다면 */
    String kinds;
    int mp;

    /* 필기.
     *  단일 책임의 원칙
     *   해당 클래스에서 생긴 변경이나 오류는 해당 클래스에서 해결
     *   -> 유지보수에 용이
     *  솔리드 원칙 중 하나
    * */

    void setInfo1(String info1){
//        this.name = info1;
        this.kinds = info1;
    }

    void setInfo2(int info2) {
//        this.hp = info2;
        this.mp = info2;
    }
}
