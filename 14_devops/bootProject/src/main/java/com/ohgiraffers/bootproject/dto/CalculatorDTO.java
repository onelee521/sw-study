package com.ohgiraffers.bootproject.dto;

import lombok.Data;

@Data
public class CalculatorDTO {

    private int num1;
    private int num2;
    private int sum;

    public CalculatorDTO(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    // 불린형일 때는 롬복에 겟터세터가 안붙으므로 어떤 메소드가 만들어지는지 확인 필요
}
