package com.spring.controller.common;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

// FrontController
// @ ▶ .xml : 서블릿 컨테이너(톰캣, 웹 서버)
public class DispatcherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private HandlerMapping handler;
	private ViewResolver viewResolver;

	public void init() {
		handler=new HandlerMapping();
		viewResolver=new ViewResolver();
		viewResolver.setPrefix("./");
		viewResolver.setSuffix(".jsp");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doAction(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doAction(request, response);
	}

	private void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String uri=request.getRequestURI();
		String cp=request.getContextPath();
		String commend=uri.substring(cp.length());
		System.out.println("FC : "+commend);

		Controller controller=handler.getController(commend);
		String view = controller.execute(request, response);

		if(view.contains(".do")) {
			view=viewResolver.getView(view);
		}
		response.sendRedirect(view);

	}
}
