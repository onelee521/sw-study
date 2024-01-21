package com.ohgiraffers.mysection.interfaceimplements;

public class Panda implements Mammalia {
    private String name;
    private int age;
    private int size;
    public Panda() {
    }

    public Panda(String name, int age, int size) {
        this.name = name;
        this.age = age;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String getFeed() {
        return feed;
    }

    @Override
    public void eat() {
        System.out.println("판다가 대나무를 먹습니다.");
    }

    @Override
    public void sleep() {
        System.out.println("판다가 잠을 잡니다.");
    }


}
