package com.ohgiraffers.section02.variable;

public class Application2 {
    public static void main(String[] args) {

        /* 수업목표. 변수를 선언하고 값을 할당하여 사용할 수 있다.(feat. 지료형(type)) */
        /* 필기.
         *  변수를 사용하는 방법
         *   1. 변수를 준비한다.(선언)
         *   2. 변수에 값을 넣어 대입한다.(값 대입 및 초기화)
         *   3. 변수를 사용한다.
        * */

        /*목차 1. 변수 선언*/
        /* 설명. 자료형이란?
         *  다양한 값의 형태별로 어느 정도의 크기를 하나의 값으로 취급할 것인지 미리 Compiler와 약속한 키워드
         *  이러한 자료형은 기본자료형(Primary type)과 참조자료형(Reference Type)으로 분류.
         *  기본자료형 8가지
        * */

        /* 설명. 정수 취급하는 자료형 */
        byte bnum;              // 1 byte
        short snum;             // 2 byte
        int inum;               // 4 byte
        long lnum;              // 8 byte

        /* 설명. 실수를 취급하는 자료형 */
        float fnum;             // 4byte
        double dnum;            // 8 byte

        /* 설명. 실수를 취합하는 정수형 */
        char ch;                // 2 byte

        /* 설명. 논리값을 취급하는 자료형 */
        boolean isTrue;         // 1 byte

        /* 설명. 문자열은 참조  자료형이다.(feat. 대문자로 시작) */
        String str;             // 4 byte

        /* 목차. 2. 변수에 값 대입(초기화) */
        bnum = 1;           // 정수의 기본값은 int, 실수의 기본 값은 double 자동형변환이 이루어져서 데이터가 담김
        snum = 2;
        inum = 4;
        lnum = 8L;          //int 범위를 넘어가면 반드시 L필요(21억 이상)

        fnum = 4.0f;        //f 안넣으면 컴파일에러
        dnum = 8.0;

        ch = 'a';
        ch = 97;                // char 자료형은 문자를 숫자로 취급
//        ch = -97;             // char 자료형은 0부터 양수만 취급
        isTrue = true;          // 변수명을 긍정의문문 형태로 작성하는 것이 관례

        /* 목차. 3. 변수 활용 */
        System.out.println("isTrue = " + isTrue);                     //출력: "isTrue = true"
        System.out.println("l과 int의 합 = " + (lnum + inum));         // 출력: "l과 int의 합 = 12"

        /* 설명. 변수의 선언과 초기화는 한 번에 가능 */
        int kor = 90;
        int math = 80;
        int eng = 75;

        int sum = kor + math + eng;
        double avg = sum / 3;                       // 설명. int/ int는 int로 연산 int값을 double로 바꿈(소수점 날아감)
        double avg2 = sum / 3.0;                    // 설명. int/double은 int를 double 바꾼 후 연산
                                                    // 설명. 나눗셈을 할 때는 소수점을 고려해야 한다.(하나라도 float 또는 double)

        System.out.println("총합: " + sum);           //출력: "총합: 245"
        System.out.println("평균: " + avg);           //출력: "평균: 81.0"
        System.out.println("평균: " + avg2);           //출력: "평균: 81.66666666666667"

    }
}
