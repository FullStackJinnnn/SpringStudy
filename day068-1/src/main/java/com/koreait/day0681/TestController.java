package com.koreait.day0681;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class TestController {
		
	@RequestMapping("/")
	public String root(Model model) { // 첫요청 root ()안의 커맨드객체 사용
		//data 와 리스트 타입의 datas 가 필요함
		//Model model=new Model(); enw 사용 금지
		model.addAttribute("data","홍길동");
		ArrayList<String> datas=new ArrayList<String>();
		datas.add("apple");
		datas.add("banana");
		datas.add("kiwi");
		model.addAttribute("datas",datas);
		System.out.println("로그");
		return "index" ;
	}
	
	//다른방식
	public ModelAndView root2(ModelAndView mav) { // 첫요청 root ()안의 커맨드객체 사용
		//mav는 addObject 사용
		mav.addObject("data","홍길동"); //output이 스트링으로 return 이 아닌 mav 객체를 return
		mav.setViewName("index");
		return mav;
		// 대부분 mav를 사용하지않고 Model을 선호 방식이나 전달하는것은 모두동일
	}
	
	//프론트단과 백단이 아예다른회사일떄 가끔 쓰이는 방법
	//커맨드를쓰려면 멤버변수의 인자이름이 같아야하는데 안같을때 쓴다.
	
	// test 1,2,3 은 모두 같은기능!
	@RequestMapping("/test")
	public String test(Data data) { // boot라면 어노테이션으로 쓸것같다 
		//근본은 Command 객체 사용
		System.out.println(data);
		return "test";
	}
	
	//@RequestMapping("/test") 얘네도 RequestMapping이 필요하다
	public String test1(HttpServletRequest req) {  // // http를 사용하면 무거워짐	
		
		String apple=req.getParameter("a");
		String banana=req.getParameter("b");
		Data data=new Data();
		data.setApple(apple);
		data.setBanana(banana);
		System.out.println(data);
		return "test";
	}
	
	//@RequestMapping("/test")
	public String test2(@RequestParam("a")String apple, @RequestParam("b")String banana) { // boot라면 어노테이션으로 쓸것같다 
		
		Data data=new Data();
		data.setApple(apple);
		data.setBanana(banana);
		System.out.println(data);
		return "test";
	}
	//예시 ... 
	// 너무많이 사용되는 케이스라 DTO에 넣는게 더일반적
	@RequestMapping("/test3/{searchCondition}/{searchKeyword}") // 추가데이터를 요청 자체에 넣는방법 searchContent or saerchKeyword 둘다사용
	public String test3(@PathVariable String searchCondition, @PathVariable String searchKeyword,Data data) { // boot라면 어노테이션으로 쓸것같다 
		//근본은 Command 객체 사용
		System.out.println(data);
		return "test3";
	}
	
	@RequestMapping("/async")
	public @ResponseBody String async() { 
		// 비동기처리시,
		// 페이지 이동 xxx
		// 정보 전달 O
		return "apple" ; // ture나 1이나 apple 같은 정보전달 (비동기)
	}

}
