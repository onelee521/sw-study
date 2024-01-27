package ohgiraffers.mysection.interfaceimplements;

public class Application {
    public static void main(String[] args) {
        System.out.println("==== 판다 월드에 오신 걸 환영합니다! =====");
        Panda panda = new Panda();
        Mammalia panda2 = new Panda();
//        Mammalia mammalia = new Mammalia();

        panda2.eat();
        panda2.sleep();

        panda.eat();
        panda.sleep();

        panda2.sleepbed();
        panda.sleepbed();

        System.out.println(panda.getFeed());
    }
}
