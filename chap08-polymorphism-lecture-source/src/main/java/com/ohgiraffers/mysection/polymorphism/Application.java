package com.ohgiraffers.mysection.polymorphism;

public class Application {
    public static void main(String[] args) {
        System.out.println("============= 기본 Car 생성 ===========");
        Car car = new Car();
        car.start();
        car.speedUp();
        car.stop();
        car.takeOn();

        System.out.println("============= Bus 생성 동적바인딩 ===========");
        Car car1 = new Bus();
        car1.takeOn();      // 동적바인딩

        System.out.println("============= Truck 생성 동적바인딩 ===========");
        Car car2 = new Truck();
        car2.takeOn();

        System.out.println("============= Car 배열 다운캐스팅 ===========");
        // 클래스 배열로 만들기
        Car[] cars = new Car[3];
        cars[0] = new Bus();
        cars[1] = new Truck();
        cars[2] = new Bus();

        for(Car car3: cars){
            if(car3 instanceof Bus) {
                ((Bus) car3).pressBell();       // 클래스 종류에 따라 다른 호출, 강제형변환(다운캐스팅)
            }
            if(car3 instanceof Truck) {
                ((Truck) car3).takeDownFoothold();
            }
        }

        System.out.println("============= Car 매개변수 활용 ===========");
        Application app = new Application();
        app.take(new Bus());
        app.take(new Truck());

        System.out.println("============= Car 리턴타입 활용 ===========");
        Car randomCar = app.getrandomCar();
        randomCar.takeOn();
    }

    private void take(Car car) {
        car.takeOn();
    }

    private Car getrandomCar() {
        int random = (int)(Math.random() * 2); // 0 ~ 1 난수 발생
        return random == 0? new Bus() : new Truck();
    }
}
