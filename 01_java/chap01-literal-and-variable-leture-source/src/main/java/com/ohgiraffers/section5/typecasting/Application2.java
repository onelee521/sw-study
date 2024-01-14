package com.ohgiraffers.section5.typecasting;

public class Application2 {

    public static void main(String[] args) {

        /* 수업목표. 강제 형변환 규칙에 대해 이해할 수 있다. */
        /* 필기.
         *  강제형변환
         *  바꾸려는 자료형으로 캐스트 연산자((자료형))를 이용하여 형변환 한다.
        * */

        long lnum = 8L;
        int inum = (int)lnum;                     //명시적 형변환
        System.out.println("inum = " + inum);

        long lnum2 = 80000000000L;
        int inum2 = (int)lnum2;                   
        System.out.println("inum = " + inum2);    // 출력: inum = -1604378624
                                                  // 오버플로우 발생, 데이터 손실을 감수하고 다운캐스팅 시에는 주의해야한다.
        
        float avg = 31.235f;
        int floatNum = (int)avg;                            // 실수 -> 정수 다운캐스팅 시 소수점 이하가 제거(버림)된다.
        System.out.println("floatNum = " + floatNum);       // 출력: floatNum = 31

    }
}
