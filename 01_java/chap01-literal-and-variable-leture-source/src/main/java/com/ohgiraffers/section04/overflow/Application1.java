package com.ohgiraffers.section04.overflow;

public class Application1 {

    public static void main(String[] args) {
        
        /* 수업목표. 오버플로우에 대해 이해할 수 있다. */
        
        /* 필기. 
         *  지료형 별 값의 최대 범위를 벗어나는 경우
         *  발생한 carry를 버림처리 하고 sign bit를 반전시켜 최소값으로 순화시킴
        * */
        
        /* 목차. 1. 오버플로우 */
        byte num1 = 127;                            // byte 자료형 양의 최대 저장 범위 값

        System.out.println("num1 = " + num1);       // 출력: 127

        num1++;                                     // num = num + 1과 의미상 같다.
        System.out.println("num1 = " + num1);       // 출력: -128

        num1++;
        System.out.println("num1 = " + num1);       // 출력: -127

        /* 목차. 언더플로우 */
        byte num2 = -128;                           // byte의 최소 저장 범위

        System.out.println("num2 = " + num2);       // 출력: -128

        num2--;                                     // num = num - 1과 의미상 같다
        System.out.println("num2 = " + num2);       // 출력: 127

        num2--;
        System.out.println("num2 = " + num2);       // 출력: 126

        /* 설명.
         *  일반적으로 많이 사용하는 int형의 최대값은 대략 21억 정도이다.
         *  이 범위를 벗어난 계산은 오버플로우를 발생기켜 원하지 않는 값이 나오게 될 수 있다.
        * */

        int firstNum = 1000000;                     // 100만
        int secondNum = 700000;                     // 70만

        int multi1 = firstNum * secondNum;           // 7천억이 나와야 함.

        System.out.println("firstNum + secondNum = " + multi1);  // 출력: -79669248
                                                                // 자료형의 크기 잘 설정하기 . long을 사용하자

        /* 이미 오버플로우 처리 된 결과를 가지고 변수에 담기 때문에 위에 결과랑 별 차이가 없다.
         * 그럼 어떻게 해결을 해야 하나?
         * 계산이 처리 되기 전에 long 타입으로 자료형을 변경해주어야 한다. (강제형변환 이용)
         * 강제 형변환은 바로 다음 섹션에서 다루게 될 예정이다.
         * */
        long multi2 = (long) firstNum * secondNum;

        System.out.println("result : " + multi2);			//정상적으로 7천억이 출력


        
    }
}
