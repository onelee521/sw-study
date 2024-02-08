package com.ohgiraffers.section01.contextListener;

import jakarta.servlet.ServletContextAttributeEvent;
import jakarta.servlet.ServletContextAttributeListener;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;

// 리스너 준비
@WebListener
public class ContextListener implements ServletContextListener, ServletContextAttributeListener {

    public ContextListener() {
        System.out.println("context listener 인스턴스 생성");
    }

    /* 설명. context에 attribute가 추가될 때 동작한다.  */
    @Override
    public void attributeAdded(ServletContextAttributeEvent event) {
        System.out.println("context attribute added");
    }

    /* 설명. context에 attribute가 제거될 때 동작한다. */
    @Override
    public void attributeRemoved(ServletContextAttributeEvent event) {
        System.out.println("context attribute removed");
    }

    /* 설명. context에 attribute가 변경될 때 동작 */
    @Override
    public void attributeReplaced(ServletContextAttributeEvent event) {
        System.out.println("context attribute replaced");
    }

    /* 설명. context가 생성될 때 생성자 호출 이후 동작 */
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("context attribute initialized");
    }

    /* 설명. context가 소멸될 때 동작 */
    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("context attribute destroyed");
    }
}
