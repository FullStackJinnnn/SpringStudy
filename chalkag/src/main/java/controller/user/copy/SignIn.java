package controller.user.copy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import model.member.MemberDTO;
import model.member.MemberService;


@Controller
public class SignIn {
	
	@Autowired
	MemberService memberService;
	
	@RequestMapping(value = "/signIn", method = RequestMethod.POST)
	public String signIn(MemberDTO memberDTO, ModelAndView mav) {
		
		if(memberService.selectOne(memberDTO)==null) {
			mav.addObject("msg", "등록된 정보가 없습니다.");
			return "redirect:signIn";
		}
		mav.addObject("msg", memberDTO.getMemberNickname()+"님 반갑습니다!");
		return "main";
	}
	
	@RequestMapping(value = "/signIn", method = RequestMethod.GET)
	public String signInPage() {
		System.out.println("signIn 로그");
		
		return "signIn";
	}

}
