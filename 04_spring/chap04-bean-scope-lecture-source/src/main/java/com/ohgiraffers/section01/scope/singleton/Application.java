package com.ohgiraffers.section01.scope.singleton;

import com.ohgiraffers.common.Beverage;
import com.ohgiraffers.common.Bread;
import com.ohgiraffers.common.Product;
import com.ohgiraffers.common.ShoppingCart;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {

        /* 설명.
         *  bean scope란?
         *   스프링 빈이 생성될 때랑 해당 인스턴스의 범위를 의미한다. 스프링에서는 다양한 bean scope를 제공
         *   1. singleton: 하나의 인스턴스만을 생성하고, 모든 빈이 해당 인스턴스를 공유하여 사용
         *   2. prototype: 매번 새로운 인스턴스를 생성
         *   3. request: Http 요청을 처리할 때마다 새로운 인스턴스를 생성하고, 요청 처리가 끝나면 인스턴스를 폐기
         *               웹 애플리케이션 컨텍스트만 해당
         *   4. session:  Http 세션 당 하나의 인스턴스를 생성히고, 세션이 종료되면 인스턴스 폐기
         *                웹 애플리케이션 컨텍스트만 해당
         *   5. globalSession: 전역 세션 당 하나의 인스턴스를 생성하고, 전역 세션이 종료되면 인스턴스 폐기
         *                      포털 애플리케이션 컨텍스트만 해당
        * */
        ApplicationContext context
                = new AnnotationConfigApplicationContext(ContextConfiguration.class);

        String[] beanNames = context.getBeanDefinitionNames();
        for (String beanName : beanNames) {
            System.out.println("beanName = " + beanName);
        }

        /* 설명. 붕어빵, 딸기우유, 지리산암반수 빈 객체를 반환 받아 변수에 담는다. */
        Product carpBread = context.getBean("carpBread", Bread.class);
        Product milk = context.getBean("milk", Beverage.class);
        Product water = context.getBean("water", Beverage.class);

        /* 설명. 첫 번째 손님이 쇼핑 카트를 꺼내 물건을 담는다. */
        ShoppingCart cart1 = context.getBean("cart", ShoppingCart.class);
        cart1.addItem(carpBread);
        cart1.addItem(milk);

        /* 설명. 첫 번째 손님의 쇼핑 카트에 담긴 물품 확인 */
        System.out.println("cart1에 담긴 물품: " + cart1.getItems());

        /* 설명. 두 번째 손님이 쇼핑 카트를 꺼내 물건을 담는다. */
        ShoppingCart cart2 = context.getBean("cart", ShoppingCart.class);
        cart2.addItem(water);

        /* 설명. 두번 째 손님의 쇼핑 카트에 담긴 물품 확인 */
        System.out.println("cart2에 담긴 물품: " + cart2.getItems());        // 싱글톤일 때, cart1에 있던 물품과 그대로 물도 담김
                                                                            // 프로토타입일 때, 물만 담김

        /* 설명. cart1과 cart2의 주소값이 같은지 확인(같은 객체인지 확인) */
        System.out.println(System.identityHashCode(cart1) == System.identityHashCode(cart2));       // 싱글톤일 떼 true, 프로토타입일 때 false

    }
}
