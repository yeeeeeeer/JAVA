package com.ohgiraffers.response.section01.response;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/response")
public class ResponseTestServlet extends HttpServlet {

	// 요청 객체 HttpServletRequest request
	// 응답 객체 HttpServletResponse response
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		
		System.out.println("default response type: " + response.getContentType());
		System.out.println("default response encoding: " + response.getCharacterEncoding());
		
		// conntenttype : set 한글로 해줘야("text/html; charset=UTF-8") 화면한글 안깨짐
		response.setContentType("text/html; charset=UTF-8");
		
		// StringBuilder: toString 문자열 쌓으려면(append) 이 객체 만들어야함
		StringBuilder responseBuilder = new StringBuilder();
		responseBuilder.append("<!doctype html>\n")
						.append("<html>\n")
						.append("<head>\n")
						.append("</head>\n")
						.append("<body>\n")
						.append("<h1>안녕 Servlet Response!</h1>\n")
						.append("</body>\n")
						.append("</html>");
						
		out.print(responseBuilder.toString());
		
		out.close();
	}

}
