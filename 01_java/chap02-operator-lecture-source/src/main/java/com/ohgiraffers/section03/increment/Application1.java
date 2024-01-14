package com.ohgiraffers.section03.increment;

public class Application1 {

    public static void main(String[] args) {

        /* 수업목표. 단항 연산자이자 증감연산자에 대해 이해하고 활용할 수 있다. */
        /* 필기.
         *  증감연신지
         *   피연산자의 앞 or 뒤에 사용이 가능하다.
         *   '++': 1 증가
         *   '--': 1 감소
        * */

        /* 목차. 1. 증감연산자를 단독으로 사용 */
        int num = 20;
        System.out.println("num = " + num);

        num++;                                  // 전위연산자
        System.out.println("num = " + num);     // 출력: num = 21

        ++num;                                  // 후위연산자
        System.out.println("num = " + num);     // 출력: num = 22

        num--;
        System.out.println("num = " + num);     // 출력: num = 21

        --num;
        System.out.println("num = " + num);     // 출력: num = 20
                                                // 출력에 큰 차이가 없음

        /* 목차. 2. 증감연산자를 다른 연산자(대입, 출력)와 함께 사용 */
        int firstNum = 20;

        int result1 = firstNum++ * 3;

        System.out.println("result1 = " + result1);         // 출력: result1 = 60
        System.out.println("firstNum = " + firstNum);       // 출력: firstNum = 21
        System.out.println("firstNum = " + firstNum++);     // 출력: firstNum = 21
        System.out.println("firstNum = " + firstNum);       // 출력: firstNum = 22
        System.out.println("firstNum = " + ++firstNum);     // 출력: firstNum = 23

    }
}
