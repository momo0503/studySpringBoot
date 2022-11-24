package com.study.springboot;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {

	
	@RequestMapping("/")
	public @ResponseBody String root() throws Exception{
		return "Model and view";
	}
	
	@RequestMapping("/test1")
	public String test1(Model model) {
		//Model 객체이용해서 view로 데이터전달
		model.addAttribute("name","홍길동");
		
		return "test1";
	}
	
	@RequestMapping("/mv")
	public ModelAndView test2() {
		//데이터와 뷰를 동시에 설정이 가능
		ModelAndView mv = new ModelAndView();
		
		List<String> list = new ArrayList<>();
		list.add("test1");
		list.add("test2");
		list.add("test3");
		
		//jstl로 호출 
		mv.addObject("lists",list);
		mv.addObject("ObjectTest","테스트입니다.");
		mv.addObject("name","홍길동");
		mv.setViewName("view/myView");
		
		return mv;
	}
	
	@RequestMapping("/form1")
	public @ResponseBody String root2() throws Exception{
		return "Form 데이터 전달받기 ";
	}
	
	@RequestMapping("/test2")
	public String test2(HttpServletRequest httpServletRequest, Model model) {
		String id = httpServletRequest.getParameter("id");
		String name = httpServletRequest.getParameter("name");
		
		model.addAttribute("id",id);
		model.addAttribute("name",name);
		return "test1";
		
	}
	
	
	@RequestMapping("/test3")
	public String test3(@RequestParam("id") String id,@RequestParam("name") String name, Model model) {
		model.addAttribute("id",id);
		model.addAttribute("name",name);
		return "test1";		
	}
	
	@RequestMapping("/test4")
	public String test4(Member member, Model model) {
		//파라미터와 일치하는 빈을 만들어서 사용, View 페이지에서 model을 사용하지않고  member를 사용한다.
		return "test3";		
	}
	
	//패스 자체에 변수 넣기
	@RequestMapping("/test5/{studentId}/{name}")
	public String test4(@PathVariable String studentId,@PathVariable String name, Model model) {
		model.addAttribute("id",studentId);
		model.addAttribute("name",name);
		return "test3";		
	}
	
	
	
}
