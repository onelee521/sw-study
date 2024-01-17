package com.ohgiraffers.mysection;


public class Ractangle {
    private double width;
    private double height;

    public Ractangle() {
    }

    public Ractangle(double width) {
        this.width = width;
    }

    public Ractangle(double width, double height) {
        this(width);
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Ractangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }

    // 넓이와 둘레를 구하는 메소드
    public double calArea() {
        return this.width * this.height;
    }

    public double calRound() {
        return (this.width + this.height) * 2;
    }

    public void printArea() {
        System.out.println("사각형의 가로 = " + width + ", 높이 = " + height);
    }
}
