package com.study.springboot.bean;

import org.springframework.stereotype.Component;

@Component("printB")
public class PrintB implements Printer{

	@Override
	public void print(String message) {
		System.out.println("print B " + message);
		
	}

}
