package com.spring.controller.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.biz.member.MemberDTO;
import com.spring.biz.member.MemberService;

import jakarta.servlet.http.HttpSession;

@Controller
public class MemberController {
	@Autowired
	private MemberService memberService;

	@RequestMapping(value = "changeName.do", method = RequestMethod.POST)
	public String changeName(MemberDTO mDTO, Model model, HttpSession session) {
		mDTO.setMid((String)session.getAttribute("member");
		if (memberService.update(mDTO)) {
			return "redirect:logout.do";

		}
		model.addAttribute("msg", "FAIL");
		return "alert.do";
	}
}
