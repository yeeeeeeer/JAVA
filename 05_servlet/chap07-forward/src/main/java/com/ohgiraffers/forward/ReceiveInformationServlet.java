package com.ohgiraffers.forward;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/forward") // 웹서블릿("js의 폼 액션에 쓴 이름")
public class ReceiveInformationServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String userId = request.getParameter("userId");
		String password = request.getParameter("password");
		
		// 콘솔 출력부분
		System.out.println("userId: " + userId);
		System.out.println("password: " + password);
		
		// setAttribute(key(중복X), value(중복O))
		request.setAttribute("userName", "다람쥐");
		
		
		// getRequestDispatcher("forward 할 대상의 url"); -> 방향정보
		RequestDispatcher rd = request.getRequestDispatcher("print");
		// 요청, 응답을 forward 함
		rd.forward(request, response);
	
		
		
	}

}
