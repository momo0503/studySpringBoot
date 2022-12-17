package comstudy.springboot;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

//유효성 검증을 위한 Validator 인터페이스 , supprots ,validate 메서드 반드시 구현 
public class ContentValidator implements Validator{

	@Override
	public boolean supports(Class<?> arg0) {
		
		return ContentDto.class.isAssignableFrom(arg0); //  검증할 객체의 클래스 타입 정보 
	}

	@Override
	public void validate(Object obj, Errors errors) {
		
		ContentDto dto = (ContentDto)obj;
		
		String sWriter = dto.getWriter();
		if(sWriter == null || sWriter.trim().isEmpty()) {
			System.out.println( " Writer is null or empty");
			errors.rejectValue("writer", "trouble");
		}
		
		String sContent = dto.getContent();
		if(sContent == null || sContent.trim().isEmpty()) {
			System.out.println("Content is null or Empty ");
			errors.rejectValue("content", "trouble");
		}
		
	}

}
