package com.ohgiraffers.section02.looping;

public class Application {

    public static void main(String[] args) {

        A_for aClass = new A_for();

        /* 필기. 단독 for문 흐름 확인용 메소드 호출 */
//        aClass.testSimpleForStatement();

        /* 필기. 반복문을 사용하는 예제(반복문의 필요성) */
//        aClass.testForExample1();
//        aClass.testForExample2();

        B_nestedFor bClass = new B_nestedFor();

        /* 필기. 중첩된 반복문을 사용하는 예제(구구단) */
//        bClass.printGugudanFromTwoToNine();

        /* 필기. 구구단 개선 */
//        bClass.printUpgradeGugudanFromTwoToNine();

        /* 필기. 중첩 반복문을 활용한 별찍기 관련 예제 */
//        bClass.printStars();

        bClass.printStars2();

        C_while cClass = new C_while();

        /* 필기. 단독 while문 흐름 확인용 메소드 호출 */
//        cClass.testSimpleWhileStatement();

        /* 필기. while문 사용하는 예제 */
//        cClass.testWhileExample();

        D_doWhile dClass = new D_doWhile();

        /* 필기. 단독 do-while문 흐름 확인용 메소드 호출 */
//        dClass.testSimpleDoWhileStatement();

        /* 필기. do-while문 사용하는 예제 */
//        dClass.testDoWhileExample();
    }

}
