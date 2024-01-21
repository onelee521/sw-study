package com.ohgiraffers.mysection.interfaceimplements;

public interface Animal {
    public static final int MAX_SiZE  = 100;
    String feed = "feed";
    void eat();

    String getFeed();
    // get set 사용 불가능? -> 생성자도 없고 final이라서 그런가?
    // getter 사용 가능, setter는 불가능이지만 자바8부터 default 메소드로 선언가능
}
