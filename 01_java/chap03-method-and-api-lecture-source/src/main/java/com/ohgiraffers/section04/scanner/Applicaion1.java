package com.ohgiraffers.section04.scanner;

import java.util.Scanner;

public class Applicaion1 {

    public static void main(String[] args) {

        /* 수업목표. java.util.Scanner를 이용한 다양한 자료형 값 입력 받기 */

//        java.util.Scanner sc = new java.util.Scanner(System.in);
        Scanner sc = new Scanner(System.in);

        /* 필기.
         *  next(): 공백이나 개행전까지 문자열 반환(공백+엔터를 쓰면 버퍼에 공백 전까지 나오고 나머지는 버퍼에 남아있음)
         *  nextln(): 공백이나 개행을 포함한 한 줄의 문자열 모두 반환
        * */

        /* 목차. 1. 문자열 입력받기 */
        System.out.print("이름을 입력하세요: ");
        String name1 = sc.next();               // 공백이나 개행전까지 문자열 반환
        String name2 = sc.nextLine();           // 공백이나 개행을 포함한 한 줄의 문자열 모두 반환
        System.out.println("입력하신 이름은: " + name1);
        System.out.println("입력하신 이름은: " + name2);

        /* 목차. 2. 정수형 입력받기 */
        System.out.print("나이를 입력하세요: ");
        int age = sc.nextInt();
        System.out.println("입력하신 나이는: " + age);

        /* 목차. 3. 실수형 입력받기 */
        System.out.print("키를 입력하세요: ");
        double height = sc.nextDouble();
        System.out.println("입력하신 키는: " + height);

        /* 목차, 4, 논리형 입력받기 */
        System.out.print("참과 거짓 중에 한 가지를 true 또는 false로 입력하세요: ");
        boolean isTrue = sc.nextBoolean();
        System.out.println("입력하신 논리 값은 " + isTrue + "입니다.");

        sc.nextLine();          //  중간에 버퍼에 남은 공백 및 개행 제거용 nextLine()

        /* 목차. 5. 문자형 입력받기 */
        System.out.print("아무 문자나 입력해주세요: ");
        char answer = sc.nextLine().charAt(0);      // 메소드 체이닝 방식으로 사용자의 입력 값에서 인덱스 번째 문자를 chat형으로 반환
//        char answer = sc.next().charAt(0);
        System.out.println("입력하신 문자는 " + answer + "입니다.");

        /* 설명.
         *  char answer = sc.nextLine().charAt(0) 에러발생이유
         *  nextInt(), nextDouble() 등은 버퍼에 있는 엔터를 가져오지 않아 버퍼에 엔터가 쌓임
         *  그 다음 nextLine()을 썼을 때 버퍼에 있던 엔터를 사용자가 입력한 것으로 받아들이고
         *  아무 것도 입력하지 않았는데 실행되어버림.
         *  해결방법
         *  1. 입력용 nextLine() 쓰기 전에 nextLine()을 사용해서 버퍼 남은 공백 및 개행 제거
         *  2. next() 사용
         * */
    }
}
