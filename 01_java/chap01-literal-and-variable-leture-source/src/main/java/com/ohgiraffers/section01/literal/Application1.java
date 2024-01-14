package com.ohgiraffers.section01.literal;

public class Application1 {
    public static void main(String[] args) {

        // 한 줄 주석 모든 주석은 한 줄 띄우고 쓰기
        /* 범위 주석*/

        /* 수업목표. 여러 가지 값의 형태를 출력할 수 있다. */
        /* 목차. 1. 숫자 형태의 값 */
        /* 목차. 1-1. 정수 형태의 값 출력 */
        System.out.println(123);

        /* 목차. 1-2. 실수 형태의 값 출력 */
        System.out.println(1.234);

        /* 목차. 2. 문자 형태의 값 출력 */
        System.out.println('a');                // 설명. 문자일 때는 싱글 쿼테이션(')
        System.out.println('1');                // 숫자도 문자로 가능
        //System.out.println('ab');             // 설명. 컴파일에러, 두글자이상은 X
        //System.out.println('');                 // 설명. 문자는 아무 것도 안넣으면 에러
        System.out.println('\u0000');           // 설명. 아무것도 안넣고 싶으면 \u0000

        /* 목차. 3. 문자열 형태의 값 출력 */
        System.out.println("안녕하세요");        // 설명. 문자열일 때는 더블 쿼테이션(")
        System.out.println("a");               // 설명. 한글자도 가능
        System.out.println("");                // 설명. 문자열은 공백 가능

        // 필기. 컴파일에러 실행 전 발생, 런타임에러 실행 후 에러

        /* 목차. 4. 논리 형태의 값 출력 */
        System.out.println(true);
        System.out.println("true");            // 설명. 더블 쿼테이션을 붙이면 문자열
        System.out.println(false);             // 설명. true 또는 false 두 값만 논리 값


    }
}
