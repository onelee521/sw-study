package com.ohgiraffers.mysection;


public class Circle {
    private static double radius;
    private String name;
     private static int size;

    {
        System.out.println("초기화 블럭 실행");
        name = "원";
    }

    static {
        System.out.println("static 초기화 블럭 실행");
//        name = "원";       // static 필드가 아니면 초기화x
        size = 3;
    }

    public Circle() {
    }

    public Circle(String name) {
        this.name = name;
        System.out.println("Circle 매개변수 1개 생성자 실행...");
    }

    public static double getRadius() {
        return radius;
    }

    public static void increaseRadius(){
        radius++;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "name='" + name + '\'' +
                ", radius= " + radius + '\'' +
                ", size= " + size + '\'' +
                '}';
    }
}
