package com.spring.controller.board;

import java.io.IOException;
import java.util.ArrayList;

import com.spring.biz.member.MemberDAO;
import com.spring.biz.member.MemberDTO;
import com.spring.controller.common.Controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MainAction implements Controller {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
				
		MemberDAO mDAO=new MemberDAO();
		MemberDTO mDTO=new MemberDTO();
		ArrayList<MemberDTO> mdatas=mDAO.selectAll(mDTO);
		request.setAttribute("mdatas", mdatas);
		
		return "main";
		
	}

}
