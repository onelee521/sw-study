package com.ohgiraffers.section02.package_and_import;

import com.ohgiraffers.section01.methode.Calculator;

public class Application1 {

    public static void main(String[] args) {

        /* 수업목표. 패키지에 대해 이해할 수 있다. */

        /* 설명. 다른 패키지는 클래스 풀네임을 써서 호출해야한다.. */
//        Calculator cal = new Calculator();            // 컴파일 에러
        com.ohgiraffers.section01.methode.Calculator cal = new com.ohgiraffers.section01.methode.Calculator();

        int pulsResult = cal.plusTwoNumber(100, 20);
        System.out.println("100과 20의 합: " + pulsResult);

        /* 목차. 2. static 메소드 호출 */
        int maxResult = com.ohgiraffers.section01.methode.Calculator.maxNumberOf(100, 20);
        System.out.println("두 수 중 큰 값: " + maxResult);
    }
}
