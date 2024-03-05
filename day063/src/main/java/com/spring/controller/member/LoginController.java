package com.spring.controller.member;

import java.io.IOException;

import com.spring.biz.member.MemberDAO;
import com.spring.biz.member.MemberDTO;
import com.spring.controller.common.Controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class LoginController implements Controller {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		MemberDAO mDAO=new MemberDAO();
		MemberDTO mDTO=new MemberDTO();
		mDTO.setMid(request.getParameter("mid"));
		mDTO.setPassword(request.getParameter("password"));
		mDTO=mDAO.selectOne(mDTO);
		if(mDTO != null) {
			HttpSession session=request.getSession();
			session.setAttribute("member", mDTO.getMid());

			return "redirect:main.do";
		}
		else {
			request.setAttribute("msg", "로그인에 실패했습니다...");

			return "goback.do";
		}

	}

}
