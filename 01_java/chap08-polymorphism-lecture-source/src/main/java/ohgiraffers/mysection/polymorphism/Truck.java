package ohgiraffers.mysection.polymorphism;

public class Truck extends Car{
    public Truck() {
        System.out.println("Truck 클래스 기본생성자 호출...");
    }

    public Truck(int speed, boolean status) {
        super(speed, status);
        System.out.println("Truck 클래스 모든 필드를 초기화하는 생성자 호출...");
    }

    @Override
    public void takeOn() {
        System.out.println("트럭이 짐을 실었습니다.");
    }

    // 트럭의 추가적인 기능
    public void takeDownFoothold() {
        System.out.println("트럭이 발판을 내립니다.");
    }
}
