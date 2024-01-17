package com.ohgiraffers.section04.constructor;

import java.util.Date;

/* 필기.
 *  생성자 작성 위치
 *   작성 위치는 문법상으로 클래스 내부에 필드 선언부 이후,
 *   메소드 선언부 이전에 작성하는 것이 관례이다.
* */
public class User {

    private String id;
    private String pwd;
    private String name;
    private java.util.Date enrollDate;

    public User() {     // 생성자: 반환형x, 무조건 클래스 이름으로
        System.out.println("User 객체를 생성합니다.");
    }

    public User(String id, String pwd, String name) {
        this.id = id;
        this.pwd = pwd;
        this.name = name;
    }

    /* 필기. 생성자와 같은 클래스 내부에 거의 필수적으로 들어가는 요소를 생성하는 단축키는 art + insert ->constructor */
    public User(String id, String pwd, String name, Date enrollDate) {

        /* 필기. 생성자 안에 this.은 해당 생성자를 통해 생성된 객체에 접근하는 것이다. */
        /* 필기. 일반적으로 필드의 변수명과 매개변수명이 동일하므로 반드시 this.을 명시해야 한다. */
        /* 필기. 생성자 안에 this() 해당 클래스의 다른 생성자를 사용하는 것이다. */
//        this.id = id;
//        this.pwd = pwd;
//        this.name = name;
//        this();                   // this()를 통한 다른 생성자 활용은 다른 하나의 생성자만 활용 가능하다.
        this(id, pwd, name);        // 클래스 안에 있는 다른 생성자 사용
        this.enrollDate = enrollDate;
//        this(id, pwd, name);      // 다른 생성자를 활용하는 구문(this())는 반드시 먼저 명시 되어야 한다,

        System.out.println("모든 필드를 초기화 하는 매개변수 있는 생성자를 통해 User 객체를 생성합니다.");
    }

    public String forInformation() {
        return this.id + ", " + this.pwd + ", " + this.name + ", " + this.enrollDate;
    }
}
