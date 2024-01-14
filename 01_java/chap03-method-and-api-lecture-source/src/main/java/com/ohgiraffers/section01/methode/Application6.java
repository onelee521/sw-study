package com.ohgiraffers.section01.methode;

public class Application6 {

    public static void main(String[] args) {

        /* 수업목표. 변환값이 있는 메소드 */
        System.out.println("main() 메소드 시작");

        Application6 app6 = new Application6();
        String returnText = app6.testMethod();

        System.out.println("returnText = " + returnText);

        /* 설명.
         *  변수에 궅이 담을 필요 없이 메소드의 반환값을
         *  한 번만 사용 할 것이라면 바로 호출해서 반환값을 활용할 수 있다.
        * */
//        System.out.println("returnText = " + app6.testMethod());      // 표현식: 하나의 리터럴로 치환 될 식, 변수 없이 한줄 코딩 가능

        System.out.println("main() 메소드 종료");

    }

    /* 필기.
     *  자료형의 기본값
     *   byte, short, int, long -> 0
     *   float -> 0.0f
     *   double -> 0.0
     *   char -> '\u0000'
     *   boolean -> false
     *  참조자료형의 기본값
     *   String, Data, Calendar -> null
    * */
    private String testMethod() {
        System.out.println("test() 메소드 실행");
        return "test";
    }
}
