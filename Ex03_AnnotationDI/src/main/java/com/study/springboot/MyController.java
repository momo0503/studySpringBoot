package com.study.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.study.springboot.bean.Member;
import com.study.springboot.bean.Printer;

@Controller
public class MyController {
	@Autowired
	Member member1;
	
	@Autowired
	@Qualifier("printB")
	Printer printer;
	
	@Autowired
	Member member2;
	
	@RequestMapping("/")
	public @ResponseBody String root() {
		
		//1. Member Bean 가져오기
		member1.print();
		
		//PrintB Bean 가져오기
		member1.setPrinter(printer);
		member1.print();
		
		//3.싱글톤인지 확인 
		if(member1 == member2) {
			System.out.println("동일 객체여");
		}else {
			System.out.println("다른 객체");
		}
		
		return "Annotation 사용";
	}
	
}
