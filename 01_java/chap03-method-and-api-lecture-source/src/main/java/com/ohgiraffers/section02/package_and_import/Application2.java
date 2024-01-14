package com.ohgiraffers.section02.package_and_import;
import com.ohgiraffers.section01.methode.Calculator;        // 패키지를 불러오는 것이 아닌 별칭을 만들어주는 것
                                                            // 같은 이름의 패키지를 구분하는 용도로도 사용(EX. DATE)
                                                            // com.ohgiraffers.section01.methode.Calculator -> Calculator

public class Application2 {

    public static void main(String[] args) {

        /* 수업목표. import에 대해 이해할 수 있다. */

        /* 목차. 1. non-static method의 경우 */
        Calculator cal = new Calculator();              // import를 활용해 줄여쓴 Calculator
        int subResult = cal.subTwoNumber(80, 21);
        System.out.println("80 - 21 = " + subResult);

        /* 목차. 2. static method의 경우 */
        System.out.println("두 수중 큰 값은: " + Calculator.maxNumberOf(22, 80));

    }
}
