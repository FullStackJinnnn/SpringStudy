package com.koreait.day071;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

		@RequestMapping("/test")
		public @ResponseBody String root(MemberDTO mDTO) {
			System.out.println(mDTO);
			
			return "확인";
		}
}
