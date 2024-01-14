package com.ohgiraffers.section01.methode;

public class Applicaiton8 {

    public static void main(String[] args) {

        /* 수업목표. static 메소드를 호출할 수 있다. */
        System.out.println("10과 20의 합: " + Applicaiton8.sumTwoNumber(10, 20));
        System.out.println("10과 20의 합: " + sumTwoNumber(10, 20));     // 호출하는 static 메소드가 같은 클래스에 존재하면
                                                                        // '클래스명.'을 생략할 수 있다.
    }

    public static int sumTwoNumber(int first, int second) { // 메소드명은 동사형 사용
        return first + second;
    }
}
