package com.study.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.study.springboot.bean.Config;
import com.study.springboot.bean.Member;
import com.study.springboot.bean.Printer;

@SpringBootApplication
public class Ex02JavaCodeDiApplication {

	public static void main(String[] args) {
		//SpringApplication.run(Ex02JavaCodeDiApplication.class, args);
	
	// 1. Ioc 컨테이너 생성
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

	//2. Member Bean 가져오기
		Member member1 = (Member)context.getBean("member1");
		member1.print();
	
	// 3. Member Bean 가져오기 
		Member member2 = context.getBean("helllooo",Member.class);
		member2.print();
		
	//4. PrintB Bean 가져오기 
		 Printer printer = context.getBean("printerB",Printer.class);
		 member1.setPrinter(printer);
		 member1.print();
	
	}

}
