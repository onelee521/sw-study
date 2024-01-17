package com.ohgiraffers.mysection;

import java.util.Arrays;
import java.util.Scanner;

public class Appliction {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        Ractangle ractangle = new Ractangle();
        ractangle.setHeight(5.0);
        ractangle.setWidth(7.0);
        System.out.println("사각형의 높이는 " + ractangle.getHeight());
        System.out.println("사각형의 넓이는 " + ractangle.getWidth());

        Triangle triangle = new Triangle();
        /* 목차. 1. 기본자료형을 매개변수로 전달 받는 메소드 호출 */
        int size = 10;
        System.out.println("call by value 전: " + size);
        triangle.testSizeChange(size);
        System.out.println("call by value 후: " + size);

        /* 목차. 2. 기본자료형 배열을 매개변수로 전달 받는 메소드 호출 */
        int side[] = new int[]{5, 7, 7};
        System.out.println("call by reference 전: " + Arrays.toString(side));
        triangle.testSideChange(side);
        System.out.println("call by reference 전: " + Arrays.toString(side));

        /* 목차. 3. 클래스 자료형을 매개변수로 전달 받는 메소드 호출 */
        Triangle triangle2 = new Triangle(10, 13);
        triangle.testClassChange(triangle2);

        /* 목차. 4. 아직 클래스 배열(객체 배열)은 배우지 않았으므로 건너 뜀 */
        /* 목차. 5. 가변인자를 매개변수로 전달 받는 메소드 호출 */
        triangle.testVariableLength();
        triangle.testVariableLength(5, 6);

        // static
        Circle circle = new Circle();
        System.out.println("static field: " + Circle.getRadius());
        Circle.increaseRadius();
        System.out.println("static field: " + Circle.getRadius());

        //initblock
        Circle circle2 = new Circle();
        System.out.println(circle2);

        // 객체배열
        Ractangle[] racArr = new Ractangle[5];
        racArr[0] = new Ractangle(4.0, 5.0);
        racArr[1] = new Ractangle(5.0, 6.0);
        racArr[2] = new Ractangle(6.0, 5.0);
        racArr[3] = new Ractangle(7.0, 9.0);
        racArr[4] = new Ractangle(8.0, 6.0);

        for(Ractangle ractangle2: racArr){
            ractangle2.printArea();
        }
    }
}
