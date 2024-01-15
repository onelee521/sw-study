package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class D_doWhile {
    public void testSimpleDoWhileStatement() {

        /* 수업목표. do-while문 단독 사용에 대한 흐름을 이해하고 적용할 수 있다. */
        // 메뉴 같은 경우에 많이 사용
        do {
            System.out.println("프로그램 실행");
        } while (false);                // do-while문은 세미콜론을 찍어주어야 함

        System.out.println("반복 종료 이후");
    }

    public void testDoWhileExample() {

        /* 수업목표. do-while문의 흐름을 이해하고 적용할 수 있다. */
        Scanner sc = new Scanner(System.in);
        String str = "";

        do {
            if(!str.equals("finish") && !str.equals("")){
                System.out.println("다시 작성해주세요.");
            }
            System.out.print("finish를 입력하세요: ");
            str = sc.nextLine();
            System.out.println(str + "을 입력하셨습니다.");
        } while (!str.equals("finish"));            // equals메소드는 String 비교에 사용되며 "=="과 같은 의미
                                                    // str 문자열 값이 'finish'와 일치하면 false가 되도록 작성
        System.out.println("프로그램 종료");
    }
}
