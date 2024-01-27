package ohgiraffers.section02.superkeyword;

import java.util.Date;

public class Computer extends Product{
    private String name;                // 연산장치
    private int hdd;                    // 하드
    private int ram;                    // 램
    private String operationSystem;     // 운영체제

    public Computer() {
        super();
        System.out.println("Computer 클래스의 기본 생성자 호출...");
    }

    public Computer(String name, int hdd, int ram, String operationSystem) {
        super();        //순서 변경 시 에러, 부모 객체가 먼저 생성됨
        this.name = name;
        this.hdd = hdd;
        this.ram = ram;
        this.operationSystem = operationSystem;
        System.out.println("Computer 클래스의 모든 필드를 초기화하는 생성자 호출...");
    }

    public Computer(String code, String brand, String name, int price, Date manufacturingDate, String name1, int hdd, int ram, String operationSystem) {
        super(code, brand, name, price, manufacturingDate);
        this.name = name1;
        this.hdd = hdd;
        this.ram = ram;
        this.operationSystem = operationSystem;
        System.out.println("Computer 클래스의 부모 필드까지 모두 초기화하는 생성자 호출...");
    }

    @Override
    public String toString() {
//        return "Computer{" +
//                "name='" + name + '\'' +
//                ", hdd=" + hdd +
//                ", ram=" + ram +
//                ", operationSystem='" + operationSystem + '\'' +
//                "} " + super.toString();
        return "Computer{" +
                "name='" + name + '\'' +
                ", hdd=" + hdd +
                ", ram=" + ram +
                ", operationSystem='" + operationSystem + '\'' +
                "} "  + "Product{" +
                "code='" + super.getCode() + '\'' +         // 자식이라도 부모의 private는 접근불가(get, set 사용)
                ", brand='" + super.getBrand() + '\'' +
                ", name='" + this.getName() + '\'' +
                ", price=" + super.getPrice() +
                ", manufacturingDate=" + super.getManufacturingDate() +
                '}';

    }
}
