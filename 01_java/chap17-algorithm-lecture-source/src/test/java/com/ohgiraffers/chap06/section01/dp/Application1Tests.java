package com.ohgiraffers.chap06.section01.dp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

/* 수업목표. 동적계획법(Dynamic Programming) 알고리즘을 활용하는 예제를 이용할 수 있다. */
/* 필기.
 *  복잡한 전체 문제를 작은 부분 문제에 대한 최적의 해결방법을 고안하여 해결하는 알고리즘
 *  규칙이 보이는 구간들에 대한 점화식을 세워 작은 문제들을 해결하면 전체 문제의 최적의 값이 나오게 된다.
* */
public class Application1Tests {
    private static Integer input1, input2, input3;
    private static Integer output1,output2, output3;
    @BeforeAll
    public static void set() {

        /* 예시1 */
        input1 = 18;
        output1 = 4;
        input2 = 4;
        output2 = -1;
        input3 = 6;
        output3 = 2;
    }

    public static Stream<Arguments> provideSource() {
        return Stream.of(
                arguments(input1, output1),
                arguments(input2, output2),
                arguments(input3, output3)
        );
    }
    @DisplayName("dp1")
    @Timeout(value = 1000, unit = TimeUnit.MILLISECONDS)
    @ParameterizedTest
    @MethodSource("provideSource")
    public void dp1test(Integer input, Integer output) throws Exception {
        Integer result = Application1.solution(input);
        Assertions.assertEquals(output, result);
    }
}
