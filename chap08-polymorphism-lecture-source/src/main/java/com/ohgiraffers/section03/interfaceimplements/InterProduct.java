package com.ohgiraffers.section03.interfaceimplements;

/* 설명. 인터페이스 간에는 다중 상속이 가능하고 implements 대신 extends를 사용한다. */
public interface InterProduct extends ParentInterProduct, AnotherParentProduct{
//    private String name;
//    public String name;
//    public static String name;
//    public static final int MAX_NUM = 100;

    /* 설명. 상수 필드만 가질 수 있기 때문에 모든 필드는 묵시적으로 public ststic final이다. */
    int MAX_NUM = 100;          // 상품 최대 100개만 저장 가능, 이 값을 활용해 조건식 작성(요구사항)

    /* 설명. 인터페이스는 생성자를 가질 수 없다. */
//    public InterProduct() {}

    /* 설명. 추상메소드만 작성이 가능하다.(public abstact) */
//    private void nonStatsicMethod();              // 오류 발생
//    public abstract void nonStaticMethod();
//    public void nonStaticMethod();                //abstact 생략하면 자동으로 생성
    void nonStaticMethod();                         //abstact public 생략하면 자동으로 생성

    /* 설명. static 메소드는 바디부까지 작성을 허용하였다.(JDK 1.8부터 추가된 기능) */
    public static void ststicVoid() {
        System.out.println("InterProduct 클래스의 staticMethod 호출됨...");
    }

    /* 설명. default 키워드를 사용하면 non-ststic 메소드로 작성 하였다.(JDK 1.8부터 추가된 기능) */
    public default void defaultMethod() {
        System.out.println("IntefaceProduct 클래스의 defalutMethod 호출됨...");
    }

    /* 설명. private도 abstract가 아닌 온전한 메소드로 사용은 가능하다.(defalut도 없이) */
    private void privateMethod() {

        /* 설명. 다른 public defalut 메소드에서 활용할 수만 있는 메소드 */
    }
}
