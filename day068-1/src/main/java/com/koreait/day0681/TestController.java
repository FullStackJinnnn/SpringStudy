package com.koreait.day0681;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
		
	@RequestMapping("/")
	public String root() { // 첫요청 root
		System.out.println("로그");
		return "index" ;
	}
	
	@RequestMapping("/async")
	public @ResponseBody String async() { 
		// 비동기처리시,
		// 페이지 이동 xxx
		// 정보 전달 O
		return "apple" ; // ture나 1이나 apple 같은 정보전달 (비동기)
	}

}
