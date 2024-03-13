package com.koreait.day072;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.validation.Valid;

@Controller
public class TestController {
	
	@RequestMapping("/")
	public String root() {
		return "index";
		
	}
	
	
	@RequestMapping("/test")
	//public @ResponseBody String test(@RequestParam("name")String name, @RequestParam("age")String age) {
	public String test(@Valid @ModelAttribute("member") MemberDTO mDTO, BindingResult result, Model model) { //@ResponseBody 제거 //스프링이 커맨드 객체 자체를 VIEW에 뿌려준다
	System.out.println(mDTO);
	
	
	/*
	 * // 강한 결합의 코드 // 결합도가 높은 코드 ▷ 안좋음...... MemberDTOValidation validator=new
	 * MemberDTOValidation validator=new MemberDTOValidation()  이 new를 없애기 위해 @valid 어노테이션 사용 
	 * //BindingResult result; 커맨드객체사용
	 * validator.validate(mDTO, result);
	 */
	if(result.hasErrors()) {
		
		if(result.getFieldError("name") != null){
			System.out.println(result.getFieldError("name").getDefaultMessage());
			// 3번째 인자가 출력될 예정
		}
		if(result.getFieldError("age") != null) {
			System.out.println(result.getFieldError("name").getDefaultMessage());
		}
		
		return "index";
	}
//	
//	model.addAttribute("name", mDTO.getName());
//	model.addAttribute("age", mDTO.getName());
	return "main";
		
	}
	
	
	
	// 코드내에 new를 지우기 위해서 사용하는 메서드
//	@InitBinder
//	void initBinder(WebDataBinder binder) {
//		binder.setValidator(new MemberDTOValidation());
//	}
}
