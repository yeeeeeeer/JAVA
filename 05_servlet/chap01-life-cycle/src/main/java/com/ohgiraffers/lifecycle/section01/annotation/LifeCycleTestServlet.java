package com.ohgiraffers.lifecycle.section01.annotation;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

// loadOnStartup : 시작과 동시에 생성자호출 / = 1 : 우선순위
@WebServlet(value = "/annotation", loadOnStartup = 1)
public class LifeCycleTestServlet extends HttpServlet {

	private int initCount = 1;
	private int serviceCount = 1;
	private int destroyCount = 1;
	
	public LifeCycleTestServlet() {
		// 기본 생성자
		System.out.println("annotation mapping 생성자 호출");
	}

	public void init(ServletConfig config) throws ServletException {
		// 서블릿 컨테이너에 의해 호출됨, 최초 요청 시 한번만 실행. 두번째 요청부터는 호출X
		System.out.println("annotation mapping init() 메소드 호출 : " + initCount++);
	}

	public void destroy() {
		// 서블릿 컨테이너가 종료될때 호출되는 메소드, 주로 자원 반납 용도로 사용.
		System.out.println("annotation mapping destroy() 메소드 호출 : " + destroyCount++);
	}

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 서블릿 컨테이너에 의해 호출됨, 최초 요청 시 init() 이후 동작하고,
		// 두번째 요청부터는 init() 호출없이 service() 메소드가 바로 호출됨
		System.out.println("annotation mapping service() 메소드 호출 : " + serviceCount++);
	}

}
