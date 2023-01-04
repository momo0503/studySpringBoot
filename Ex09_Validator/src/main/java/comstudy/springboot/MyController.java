package comstudy.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

	
	@RequestMapping("/")
	public @ResponseBody String root() throws Exception{
		return " Validator (1) ";
	}
	
	@RequestMapping("/insertForm")
	public String insert1() {
		return "createPage";
	}
	
	@RequestMapping("/create")
	public String insert2(@ModelAttribute("dto") ContentDto contentDto, BindingResult result) {
		String page = "createPAge";
		System.out.println(contentDto);
		
		ContentValidator validator = new ContentValidator();
		validator.validate(contentDto, result);
		if(result.hasErrors()) {
			page = "createPage";
		}
		
		return page;
	}
	
	@RequestMapping("/create2")
	public String insert3(@ModelAttribute("dto") ContentDto contentDto, BindingResult result) {
		String page = "createPAge";
		System.out.println(contentDto);
		
		ContentValidator validator = new ContentValidator();
		validator.validate(contentDto, result);
		if(result.hasErrors()) {
			page = "createPage";
		}
		
		return page;
	}

	
	
	
}
