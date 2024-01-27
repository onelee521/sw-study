package ohgiraffers.mysection.interfaceimplements;

public interface Mammalia extends Animal{
    String BED = "침대";
//    @Override
//    void eat();           //인터페이스끼리는 오버라이딩 안해도 됨.
    void sleep();


    public default void sleepbed() {
        System.out.println(BED + "에서 잡니다.");
    }

    // Mammalia.sleepbed만 가능
//    public static void sleepbed() {
//        System.out.println("판다가 " + BED + "에서 잡니다.");
//    }
}
