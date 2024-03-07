package com.spring.controller.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.spring.biz.member.MemberDAO;
import com.spring.biz.member.MemberDTO;
import com.spring.biz.member.MemberService;

import jakarta.servlet.http.HttpSession;

@Controller("login")
public class LoginController {
	
	@Autowired
	private MemberService memberService;

	@RequestMapping(value="/login.do", method=RequestMethod.POST)
	public String login(MemberDTO mDTO, MemberDAO mDAO, Model model, HttpSession session) throws Exception {
	//	ModelAndView mav=new ModelAndView();
		
		//MemberDAO mDAO=new MemberDAO();
//이제 이거 3개다 생략가능~
//		MemberDTO mDTO=new MemberDTO();
//		mDTO.setMid(request.getParameter("mid"));
//		mDTO.setPassword(request.getParameter("password"));
//		mDTO=mDAO.selectOne(mDTO);
		mDTO=memberService.selectOne(mDTO);
		if(mDTO != null) {
		//	HttpSession session=request.getSession();
			session.setAttribute("member", mDTO.getMid());

			return "redirect:main.do";
		}
		else {
			model.addAttribute("msg", "로그인에 실패했습니다...");

			return "goback.do";
		}		
	}
	
	@RequestMapping(value="/logout.do", method=RequestMethod.GET)
	public String logout(HttpSession session) throws Exception {
		ModelAndView mav=new ModelAndView();
		mav.addObject("msg", "로그아웃이 완료되었습니다! :D");
		return "alert.do";
	}

}
