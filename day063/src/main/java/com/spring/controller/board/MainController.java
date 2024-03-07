package com.spring.controller.board;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.biz.board.BoardDTO;
import com.spring.biz.board.BoardService;

@Controller("main")
public class MainController {
	
	private BoardService boardService;

	@RequestMapping(value="/main.do", method=RequestMethod.GET)
	public String main(BoardDTO bDTO, Model model) {
		model.addAttribute("datas", boardService.selectAll(bDTO));
		return "main";
	}

}
