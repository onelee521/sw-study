package com.ohgiraffers.mysection;


import java.util.Arrays;

public class Triangle {

    // 필드 선언
    private int base;
    private int height;

    public Triangle() {
    }

    // 생성자
    public Triangle(int base) {
        this.base = base;
    }

    public Triangle(int base, int height) {
        this(base);
        this.height = height;
    }

    // getter, setter, toString
    public int getBase() {
        return base;
    }

    public int getHeight() {
        return height;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "base=" + base +
                ", height=" + height +
                '}';
    }

    public void calArea() {
        System.out.println((this.base * this.height)/2);
    }

    public void testSizeChange(int size) {
        System.out.println("매개변수로 전달 받은 값: " + size );
        size = 5;
        System.out.println("변경한 값: " + size);
    }

    public void testSideChange(int[] side) {
        System.out.println("매개변수로 전달 받은 값: " + Arrays.toString(side));
        side[0] = 4;
        System.out.println("변경한 값: " + Arrays.toString(side));
    }

    public void testClassChange(Triangle triangle) {
        System.out.print("변경 전 삼각형의 넓이: ");
        triangle.calArea();
        triangle.setBase(7);
        triangle.setHeight(10);
        System.out.print("변경 후 삼각형의 넓이: " );
        triangle.calArea();
    }

    public void testVariableLength(int... num) {
        System.out.println(Arrays.toString(num));
    }
}
