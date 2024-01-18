package com.ohgiraffers.section01.polymorphism;

public class Tiger extends Animal{

    @Override
    public void eat() {
        System.out.println("호랑이가 고기를 뜯어 먹습니다.");
    }

    @Override
    public void run() {
        System.out.println("호랑이는 웬만해서 달리지않습니다.");
    }

    @Override
    public void cry() {
        System.out.println("호랑이가 어흥 울음소리를 냅니다.");
    }

    /* 설명. 호랑이는 추가적으로 물어뜯기를 할 수 있다. */
    public void bite() {
        System.out.println("호랑이가 물어뜯습니다.");
    }
}
