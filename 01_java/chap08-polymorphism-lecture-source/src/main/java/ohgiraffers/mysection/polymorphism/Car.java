package ohgiraffers.mysection.polymorphism;

public class Car {
    private int speed;
    private boolean status;

    public Car() {
        System.out.println("Car 클래스 기본생성자 호출...");
    }

    public Car(int speed, boolean status) {
        this.speed = speed;
        this.status = status;
        System.out.println("Car 클래스 모든 필드 초기화하는 생성자 호출...");
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isStatus() {
        return status;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void start() {
        if(status) {
            System.out.println("자동차에 이미 시동이 걸려있습니다.");
        } else {
            status = true;
            System.out.println("자동차에 시동이 걸립니다.");
        }
    }

    public void speedUp() {
        if(status) {
            speed += 5;
            System.out.println("현재 시속: " + speed);
        } else {
            System.out.println("먼저 자동차에 시동을 걸어주세요");
        }
    }

    public void stop() {
        if(status) {
            status = false;
            speed = 0;
            System.out.println("자동차가 멈춥니다.");
        } else {
            System.out.println("이미 자동차가 멈춰있습니다.");
        }

    }

    public void takeOn() {
        System.out.println("자동차가 무언가를 실었습니다.");
    }

    @Override
    public String toString() {
        return "Car{" +
                "speed=" + speed +
                ", status=" + status +
                '}';
    }
}
