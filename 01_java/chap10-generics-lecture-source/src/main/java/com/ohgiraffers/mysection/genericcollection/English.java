package com.ohgiraffers.mysection.genericcollection;

public class English extends MainSubject{
    private String eng;

    public English() {
    }

    public English(String eng) {
        this.eng = eng;
    }

    public String getEng() {
        return eng;
    }

    public void setEng(String eng) {
        this.eng = eng;
    }

    @Override
    public void solved() {
        System.out.println("영어 문제를 풀었습니다!");
    }
}
