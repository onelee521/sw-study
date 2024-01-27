package ohgiraffers.section01.extend;

public class FireCar extends Car{
    public FireCar() {
        super();        // 부모의 기본 생성자를 의미, 상속 받은 것이 아니고 부모객체를 인지하는 것
        System.out.println("FireCar 클래스의 기본 생성자 호출...");
    }

    /* 필기.
     *  @Override 어노테이션을 추가하는 이유
     *  1. 메소드 중 부모로부터 물려받은 메소드인 것을 한 눈에 알아보기 쉽게 하기 위해서(가독성 측면)
     *  2. 부모의 매소드를 오버라이딩할 때 발샐할 수 있는 실수를 방지하기 위해서(실수방지 측면)
     * */

    @Override
    public void soundHorn() {   // 메소드 재정의
        if(isRunning()) {
            System.out.println("아주 크게 경적을 울립니다.");
        } else {
            System.out.println("주행 중이 아닐 때는 경적을 울릴 수 없습니다.");
        }
    }

    public void sprayWater() {
        System.out.println("불난 곳을 발견 했습니다. 물을 뿌립니다.");
    }
}
