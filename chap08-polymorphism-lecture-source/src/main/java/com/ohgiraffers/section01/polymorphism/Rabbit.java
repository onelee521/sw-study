package com.ohgiraffers.section01.polymorphism;

public class Rabbit extends Animal{
    @Override
    public void eat() {
        System.out.println("토끼가 풀을 뜯어 먹습니다.");
    }

    @Override
    public void run() {
        System.out.println("토끼가 깡총깡총 뜁니다.");
    }

    @Override
    public void cry() {
        System.out.println("토끼가 끼익 울음소리를 냅니다.");
    }

    /* 설명. 토끼는 추가적으로 점프를 할 수 있다. */
    public void jump() {
        System.out.println("토끼가 점프를 합니다.");
    }
}
