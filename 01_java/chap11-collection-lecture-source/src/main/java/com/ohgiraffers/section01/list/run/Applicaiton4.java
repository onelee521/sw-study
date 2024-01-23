package com.ohgiraffers.section01.list.run;

import java.util.Stack;

public class Applicaiton4 {
    public static void main(String[] args) {

        /* 수업목표. Stack에 대해 이해하고 사용할 수 있다. */
        /* 필기
         *  Stack
         *   후입선출(LIFO) 또는 선입후출(FILO) 구조의 자료구조이다.
         *   push(), pop(), peek() 등의 메소드를 활용하여 자료를 처리할 수 있다.
         *   Vector를 상속한 클래스이다.
        * */
        Stack<Integer> integerStack = new Stack<>();

        /* 설명. Stack 인스턴스 생성 */
        integerStack.push(1);
        integerStack.push(2);
        integerStack.push(3);
        integerStack.push(4);
        integerStack.push(5);

        System.out.println(integerStack);

        /* 필기.
         *  peek(): 해당 스택의 최상단(top)에 있는 요소 반환
         *  search(): 해당요소와 일치하는 요소의 위치를 최상단부터 몇 번째인지 반환
         *  pop(): 해당 스택의 최상단에 있는 요소 반환 후 제거
        * */
        System.out.println("peek(): " + integerStack.peek());       // 마지막 요소 확인
        System.out.println(integerStack);

        System.out.println("search(): " + integerStack.search(2));      // 해당 요소의 위치를 최상단부터 몇 번째인지 반환

        System.out.println("pop(): " + integerStack.pop());         // 마지막 요소 추출
        System.out.println("pop(): " + integerStack.pop());
        System.out.println("pop(): " + integerStack.pop());
        System.out.println("pop(): " + integerStack.pop());
        System.out.println("pop(): " + integerStack.pop());
        System.out.println(integerStack);
    }
}
