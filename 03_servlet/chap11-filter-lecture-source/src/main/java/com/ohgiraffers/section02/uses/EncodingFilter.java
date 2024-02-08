package com.ohgiraffers.section02.uses;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;

import java.io.IOException;

@WebFilter("/member/*")
public class EncodingFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        // 다운캐스팅 이유?
        HttpServletRequest httpRequest = (HttpServletRequest) servletRequest;

//        if(httpRequest.getMethod().equals("POST"))        // nullPointerException 발생할 수도 있으므로 리터럴 값이 앞에와야함
        /* 설명. 현재 톰캣 10 버전을 사용 중이므로 톰캣 10 버전은 기본 인코딩 설정이 UTF-8이라 안해도 됨 */
        /* 설명. 요청이 POST 요청일 때는 UTF-8 인코딩 설정을 사전에 처리해 주고 이후 필터나 서블릿으로 넘길 수 있다. */
        if("POST".equals(httpRequest.getMethod())) {
            httpRequest.setCharacterEncoding("UTF-8");
        }

        filterChain.doFilter(httpRequest, servletResponse);
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}
