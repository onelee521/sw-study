package com.ohgiraffers.section02.extend.vo;

public class RabbitFarm<T extends Rabbit> { //Rabbit이거나 Rabbit자손만 가능
    private T animal;

    public RabbitFarm() {
    }

    public RabbitFarm(T animal) {
        this.animal = animal;
    }

    public T getAnimal() {
        return animal;
    }

    public void setAnimal(T animal) {
        this.animal = animal;
    }
}
