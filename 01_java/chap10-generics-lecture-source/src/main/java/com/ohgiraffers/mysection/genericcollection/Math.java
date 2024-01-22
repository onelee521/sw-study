package com.ohgiraffers.mysection.genericcollection;

public class Math extends MainSubject{
    private int num;

    public Math() {
    }

    public Math(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public void solved() {
        System.out.println("수학 문제를 풀었습니다!");
    }
}
