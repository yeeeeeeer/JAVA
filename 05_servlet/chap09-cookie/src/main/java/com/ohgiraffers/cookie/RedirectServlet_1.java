package com.ohgiraffers.cookie;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/redirect")
public class RedirectServlet_1 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String firstName = request.getParameter("fistName");
		String lastName = request.getParameter("lastName");
		
		/*
		 * [ 쿠키 쓰는 법 ]
		 * 1. request에서 쿠키 목록을 쿠키 배열의 형태로 꺼내온다.
		 * 2. 쿠키의 getName, getValue를 이용해 쿠키에 담긴 값을 사용한다.
		 * */
		
		// 1. 배열형태로 받은 쿠키 목록
		Cookie[] cookies = request.getCookies();
		for(int i =0; i < cookies.length; i++) {
			System.out.println("[cookie] " + cookies[i].getName() + " : " + cookies[i].getValue());
	
			if("firstName".equals(cookies[i].getName())) {
				firstName = cookies[i].getValue();
			}else if("lsatName".equals(cookies[i].getName())) {
				lastName = cookies[i].getValue();
			}
		}
		
		
		StringBuilder responseText = new StringBuilder();
		responseText.append("<!doctype html>\n>")
					.append("<html>\n")
					.append("<head>\n")
					.append("</head>\n")
					.append("<body>\n")
					.append("<h3>\n")
					.append(lastName + firstName + " 님 환영합니다 !!")
					.append("</h3>\n")
					.append("</body>\n")
					.append("</html>\n");
		
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.print(responseText.toString());
		out.close();
		
		
	}

}
