package com.ohgiraffers.section04.dto;

import java.util.Date;

/* 필기.
 *  자바빈(Java Bean)이란?
 *   JSP에서 배우게 될 표준 액션 태그로 접근할 수 있게 만든 자바 클래스이다.
 *   자바 코드를 모르는 웹 퍼블리셔들도 자바 코드를 사용할 수 있도록 태그 형식으로 지원하는 문법을 의미하는데,
 *   그 때 사용할 수 있도록 규칙을 지정해 놓은 java 클래스를 자바빈(java bean)이라고 부른다.
 *   지금은 특정 목적에 따라 클래스를 작성해 놓은 규칙이라고 보면 된다.
* */

/* 필기.
 *  자바빈 작성 규칙
 *  1. 자바빈은 특정 패키지에 속해있어야 할(default 패키지 사용 금지)
 *  2. 필드 접근제어자는 private로 선언해야 함
 *  3. 기본생성자가 명시적으로 존재해야 한다.(매개변수 있는 생성자는 선택사항)
 *  4. 모든 필드에 접근 가능한 설정자(setter)와 접근자(getter)가 public으로 작성되어 있어야 함.
 *  5. 직렬화(Seriaizable 구현)를 고려해야 한다.(선택사항)
 *     직렬화: 자바 시스템 내부에서 사용되는 객체 또는 데이터를 외부의 자바 시스템에서도 사용할 수 있도록 바이트(byte) 형태로
 *            데이터 변환하는 기술 및 변환된 데이터를 다시 객체로 변환하는 기술
* */

/* 필기. DTO: Data Transfer Object */
public class UserDTO {

    /* 필기. 1. 필드(멤버변수) */
    private String id;
    private String pwd;
    private String name;
    private java.util.Date enrollDate;

    /* 필기. 매개변수 있는 생성자만 있으면 기본생성자는 자동 생성되지 않는다. */
    /* 필기. 2. 생성자(기본생성자는 필수로 명시적 작성) */
    public UserDTO() {
    }

    public UserDTO(String id, String pwd, String name, Date enrollDate) {
        this.id = id;
        this.pwd = pwd;
        this.name = name;
        this.enrollDate = enrollDate;
    }

    /* 필기. 3. 설정자(setter)와 접근자(getter) */
    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    /* 설명. 이후 나머지 sectter, getter는 단축키(alt + insert)로 */
    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEnrollDate(Date enrollDate) {
        this.enrollDate = enrollDate;
    }

    public String getPwd() {
        return pwd;
    }

    public String getName() {
        return name;
    }

    public Date getEnrollDate() {
        return enrollDate;
    }

//    public String forInformation() {
//        return id + ", " + pwd + ", " + name + ", " + enrollDate;
//    }

    /* 필기. 4. 모든 멤버 변수를 String으로 반환하는 toString() */
    @Override
    public String toString() {
        return "UserDTO{" +
                "id='" + id + '\'' +
                ", pwd='" + pwd + '\'' +
                ", name='" + name + '\'' +
                ", enrollDate=" + enrollDate +
                '}';
    }
}

