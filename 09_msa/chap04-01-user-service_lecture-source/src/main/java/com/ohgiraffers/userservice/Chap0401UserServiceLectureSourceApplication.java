package com.ohgiraffers.userservice;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
public class Chap0401UserServiceLectureSourceApplication {

	public static void main(String[] args) {
		SpringApplication.run(Chap0401UserServiceLectureSourceApplication.class, args);
	}

	/* 설명. ModelMapper 빈으로 등록(필요하면 의존성 주입 받을 예정) 스프링이 알아서 객체 생성해주기 위해 사용 */
	@Bean
	public ModelMapper getModelMapper() {
		return new ModelMapper();
	}

}
