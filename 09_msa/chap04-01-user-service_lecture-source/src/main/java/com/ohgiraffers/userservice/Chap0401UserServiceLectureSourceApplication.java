package com.ohgiraffers.userservice;

import org.bouncycastle.crypto.generators.BCrypt;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class Chap0401UserServiceLectureSourceApplication {

	public static void main(String[] args) {
		SpringApplication.run(Chap0401UserServiceLectureSourceApplication.class, args);
	}

	/* 설명. ModelMapper 빈으로 등록(필요하면 의존성 주입 받을 예정) 스프링이 알아서 객체 생성해주기 위해 사용 */
	@Bean
	public ModelMapper getModelMapper() {
		return new ModelMapper();			// 현재는 STANDARD 모드(임의적인 매핑도 가능한 상태이니 주의)
	}

	/* 설명. 비밀번호 암호화를 위함 BCrypt bean 추가 */
	@Bean
	public BCryptPasswordEncoder bCryptPasswordEncoder() {
		return new BCryptPasswordEncoder();
	}

}
