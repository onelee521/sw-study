package com.ohgiraffers.bootproject.controller;

import com.ohgiraffers.bootproject.dto.CalculatorDTO;
import com.ohgiraffers.bootproject.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CalculatorController {
    private final CalculatorService calculatorService;

    @Autowired
    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping("/health_check")
    public String health() {
        return "fine";
    }

    @GetMapping("/plus")
//    @ModelAttribute를 붙이면 프론트의 Model에도 해당 DTO의 값을 바로 저장
//    해당 어노테이션을 적지 않으면 add.Model()로 직접 넣어줘야 함.
//    public CalculatorDTO getPlus(@ModelAttribute CalculatorDTO calculatorDTO) {
    public CalculatorDTO getPlus(CalculatorDTO calculatorDTO) {
        System.out.println(calculatorDTO.getNum1() + " + " + calculatorDTO.getNum2());

        int result = calculatorService.plus(calculatorDTO);
        calculatorDTO.setSum(result);

        // 프론트로 응답하기 직전에 result에 담긴 값 출력해서 확인
        System.out.println("result: " + result);
        return calculatorDTO;
    }
}
