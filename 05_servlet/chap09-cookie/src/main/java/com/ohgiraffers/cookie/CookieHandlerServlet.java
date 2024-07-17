package com.ohgiraffers.cookie;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/cookie")
public class CookieHandlerServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String  firstName = request.getParameter("firstName");
		String  lastName = request.getParameter("lastName");
	
		System.out.println("firstName: " + firstName);
		System.out.println("lastName: " + lastName);
		
        /*
         * [ 쿠키 사용법 ]
         * 1. 쿠키를 생성한다. (이름 유의사항 참고)
         * 2. 생성한 쿠키의 만료 시간을 설정한다.
         * 3. 응답 헤더에 쿠키를 담는다.
         * 4. 응답을 보낸다.
         * 
         * [ 제약 사항 ] 
         * 쿠키의 이름은 ascii 문자만 사용OK . 한번 설정한 쿠키 이름은 변경X
         * 쿠키의 이름에 공백문자, 일부 특수문자([ ] ( ) = - " / ? @ : ;) 사용X
         * */
		
		// 1. 쿠키 생성
		Cookie firstNameCookie = new Cookie("firstName", firstName);
		Cookie lastNameCookie = new Cookie("lastName", lastName);
		
		// 2. 쿠키 만료시간 설정하기
		firstNameCookie.setMaxAge(60 * 60 * 24);
		lastNameCookie.setMaxAge(60 * 60 * 24);
		
		// 3. 응답헤더에 쿠키 담기
		response.addCookie(firstNameCookie);
		response.addCookie(lastNameCookie);
		
		// 4. 응답 보내주기
		response.sendRedirect("redirect");
		
	}

}
