package com.study.springboot.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
	// bean : 스프링이 IoC 방식으로 관리하는 객체
	// 빈 팩토리 : 스프링 ioC를 담당하는 핵심 컨테이너
	// 어플리케이션 컨텍스트(ApplicationContext) : 빈 팩토리를 확장한 IoC 컨테이너
	

	//setter 통함 의존성 주입
	@Bean
	public Member member1() {
		Member member1 = new Member(); 
		member1.setName("ym");
		member1.setNickname("momo");
		member1.setPrinter(new PrintA());
	
		return member1;
	}
	
	
	//생성자 통한 의존성 주입
	@Bean(name ="helllooo")
	public Member member2() {
		return new Member("tak","tak1",new PrintA());
	}
	
	
	@Bean
	public PrintA printerA() {
		return new PrintA();
	}
	
	@Bean
	public PrintB printerB() {
		return new PrintB();
	}
	
	
	
	
}
