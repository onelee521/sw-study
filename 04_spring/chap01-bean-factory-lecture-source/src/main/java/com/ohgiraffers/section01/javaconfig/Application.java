package com.ohgiraffers.section01.javaconfig;

import com.ohgiraffers.common.MemberDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(ContextConfiguration.class);

//        String[] beanNames = context.getBeanDefinitionNames();
//        for(String bean: beanNames) {
//            System.out.println("beanName: " + bean);
//        }
        
        /* 설명. 1. bean의 id(bean의 이름)를 이용해서 bean을 가져오는 방법 */
        // 다운캐스팅 필요
//        MemberDTO member = (MemberDTO) context.getBean("member");     // 출력: member = MemberDTO(sequence=1, id=user01, pwd=pass01, name=홍길동)

        /* 설명. 2. bean의 클래스 메타 정보(bean 타입)를 전달하여 가져오는 방법 */
        // 하나 일 때 하나만 나옴. 그럼 bean이 3개일 때는?
//        MemberDTO member = context.getBean(MemberDTO.class);        // 출력: member = MemberDTO(sequence=1, id=user01, pwd=pass01, name=홍길동)

        /* 설명. 3. bean의 id와 클래스 메타 정보를 전달하여 가져오는 방법 */
        // 가장 정확하게 전달 받을 수 있는 방법
        MemberDTO member = context.getBean("member", MemberDTO.class);

        System.out.println("member = " + member);
    }
}
