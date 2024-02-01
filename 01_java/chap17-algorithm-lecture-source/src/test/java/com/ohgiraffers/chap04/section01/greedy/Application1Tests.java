package com.ohgiraffers.chap04.section01.greedy;

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

/* 수업목표. 그리디(Greedy) 알고리즘에 대해 이해할 수 있다. */
/* 필기.
 *  현재 상태에서 최적의 해답(최대 이익을 주는 해답)을 찾기 위해 적용하는 알고리즘으로
 *  앞의 선택이 이후에 영향을 주지 않을 때 사용
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
    @DisplayName("greedy1")
    @Timeout(value = 1000, unit = TimeUnit.MILLISECONDS)
    @ParameterizedTest
    @MethodSource("provideSource")
    public void greedy1test(Integer input, Integer output) throws Exception {
        Integer result = Application1.solution(input);
        Assertions.assertEquals(output, result);
    }

}
