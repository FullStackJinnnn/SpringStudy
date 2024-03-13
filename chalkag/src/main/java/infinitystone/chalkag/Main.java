package infinitystone.chalkag;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Main {
	@RequestMapping("/")
	public String main() {
		System.out.println("[로그] 인덱스 이동");
		return "index";
		
	}
	
	 @RequestMapping(value = "/main", method = RequestMethod.GET)
	public String mainPage() {
		System.out.println("[로그] 메인 페이지 이동");
		return "main"; // main.jsp로 이동
	}

}
