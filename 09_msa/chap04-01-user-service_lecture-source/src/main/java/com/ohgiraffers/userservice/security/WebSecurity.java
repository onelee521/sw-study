package com.ohgiraffers.userservice.security;

import com.ohgiraffers.userservice.service.UserService;
import jakarta.servlet.Filter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
public class WebSecurity { // extends가 있으면 옛날 방식

    UserService userService;
    BCryptPasswordEncoder bCryptPasswordEncoder;
    Environment env;

    @Autowired
    public WebSecurity(UserService userService,
                       BCryptPasswordEncoder bCryptPasswordEncoder,
                       Environment env) {
        this.userService = userService;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
        this.env = env;
    }

    /* 설명. 인가(Authorization)용 메소드, 403에러, 회원은 맞지만 권환이 있는지 확인 */
    @Bean
    protected SecurityFilterChain configure(HttpSecurity http) throws Exception {

        /* 설명. 로그인 시 추가할 내용 */
        AuthenticationManagerBuilder authenticationManagerBuilder =
                http.getSharedObject(AuthenticationManagerBuilder.class);
        authenticationManagerBuilder.userDetailsService(userService).passwordEncoder(bCryptPasswordEncoder);

        AuthenticationManager authenticationManager = authenticationManagerBuilder.build();

        /* 설명. JWT 로그인 처리를 할 것이르모  csrf는 신경쓸 필요가 없다. */
        http.csrf((csrf) -> csrf.disable());  // csrf: 크로스사이트 체크

        http.authorizeHttpRequests((auth) -> auth
                .requestMatchers(new AntPathRequestMatcher("/health_check")).permitAll()
                .requestMatchers(new AntPathRequestMatcher("/users/**")).permitAll()
                .requestMatchers(new AntPathRequestMatcher("/login")).permitAll()
        )
                .authenticationManager(authenticationManager);

        http.addFilter(getAuthentictionFilter(authenticationManager));

        return http.build();
    }

    /* 설명. 인증(Authentication)용 메소드, 401에러, 회원인지 확인 */
    private Filter getAuthentictionFilter(AuthenticationManager authenticationManager) {
        return new AuthenticationFilter(authenticationManager, userService, env);
    }


}
