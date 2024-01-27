package ohgiraffers.mysection.polymorphism;

public class Bus extends Car {
    public Bus() {
        System.out.println("Bus 클래스 기본생성자 호출...");
    }

    public Bus(int speed, boolean status) {
        super(speed, status);
        System.out.println("Bus 클래스 모든 필드 초기화 하는 생성자 호출...");
    }

    @Override
    public void takeOn() {
        System.out.println("버스가 사람을 태웠습니다.");
    }

    // 버스의 추가적인 기능
    public void pressBell() {
        System.out.println("버스가 호출벨을 눌렀습니다.");
    }
}
