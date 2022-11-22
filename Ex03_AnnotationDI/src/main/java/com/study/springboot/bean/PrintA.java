package com.study.springboot.bean;

import org.springframework.stereotype.Component;

@Component("printA")
public class PrintA implements Printer{

	@Override
	public void print(String message) {
		System.out.println("print A : "+ message);
	}

}
