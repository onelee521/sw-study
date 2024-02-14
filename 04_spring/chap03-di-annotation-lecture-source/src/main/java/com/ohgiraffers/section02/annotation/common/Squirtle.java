package com.ohgiraffers.section02.annotation.common;

import org.springframework.stereotype.Component;

@Component // @Component를 했을 때 이름을 따로 지정하지 않으면 클래스 이름에 첫글자를 소문자로 바꿔 사용
public class Squirtle implements Pokemon{
    @Override
    public void attack() {
        System.out.println("꼬부기 물대포");
    }
}
