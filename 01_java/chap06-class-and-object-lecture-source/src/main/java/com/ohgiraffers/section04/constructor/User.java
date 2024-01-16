package com.ohgiraffers.section04.constructor;

import java.util.Date;

public class User {

    private String id;
    private String pwd;
    private String name;
    private java.util.Date enrollDate;

    public User() {     // 생성자: 반환형x, 무조건 클래스 이름으로
        System.out.println("User 객체를 생성합니다.");
    }

    public User(String id, String pwd, String name, Date enrollDate) {
        this.id = id;
        this.pwd = pwd;
        this.name = name;
        this.enrollDate = enrollDate;
    }

    public String forInformation() {
        return this.id + ", " + this.pwd + ", " + this.name + ", " + this.enrollDate;
    }
}
