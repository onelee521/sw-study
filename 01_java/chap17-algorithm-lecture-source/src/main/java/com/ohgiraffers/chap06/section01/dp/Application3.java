package com.ohgiraffers.chap06.section01.dp;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Application3 {

    public static BufferedReader toBufferedReader(String str) {
        InputStream is = new ByteArrayInputStream(str.getBytes());
        return new BufferedReader(new InputStreamReader(is));
    }

    /* 설명. 최대 100까지 입력 가능하므로 101크기 dp배열(dp테이블) 준비 */
    public static Integer[] dp = new Integer[101];

    public static int solution(int n) {
//        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 1;
        dp[3] = 1;

        return padovan(n);
    }

    private static int padovan(int n) {

        /* 설명. if문은 기존에 dp에 쌓여있는 값이 있을 때 점화식을 다시 사용하지 않도록 조건식 작성(효율성 증가) */
        if(dp[n] == null)           // 현재 위치의 값(n)은 3번째 전(n-3)과 2번째 전(n-2)의 값을 더한 것이다.
            dp[n] = padovan(n - 3) + padovan(n - 2);
        return dp[n];
    }
}
