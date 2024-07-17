package com.ohgiraffers.response.section02.headers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.Iterator;

@WebServlet("/headers")
public class ResponseHeaderPrintServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// 1. 응답 contenttype 설정하기
		response.setContentType("text/html; charset=UTF-8");
		
		// 2. 응답 stream 가져오기
		PrintWriter out = response.getWriter();
		
		// 3. 응답 내보내기(System.currentTimeMillis())
		out.print("<h1>현재 시간은 " + System.currentTimeMillis() + "입니다.</h1>");
		out.close();
		
		Collection<String> responseHeaders = response.getHeaderNames();
		Iterator<String> iter = responseHeaders.iterator();
		while(iter.hasNext()) {
			String headerName = iter.next();
			System.out.println(headerName + " : " + response.getHeader(headerName)); // response.getHeader(headerName) : header의 key를 value값을 준다
		}
	}

}
