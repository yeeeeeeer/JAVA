package com.ohgiraffers.jsp.menu.comtroller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/menu/order")
public class MenuOrderServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		// 1. 요청받기
		String menuName = request.getParameter("menuName");
		int amount = Integer.parseInt(request.getParameter("amount"));
		
		
		// 2. 비즈니스 로직 
		int orderPrice = 0;
		
		switch(menuName) {
		case "초코나무숲" :
			menuName = "초코나무숲";
			orderPrice = 4000 * amount;
			break;
		case "민트초콜릿칩" :
			menuName = "민트초콜릿칩";
			orderPrice = 3400 * amount;
			break;
		case "엄마는외계인" :
			menuName = "엄마는외계인";
			orderPrice = 3500 * amount;
			break;
		case "아몬드봉봉" :
			menuName = "아몬드봉봉";
			orderPrice = 3800 * amount;
			break;
		}
		
		
		// 3. 요청 반환
		request.setAttribute("menuName", menuName);
		request.setAttribute("amount", amount);
		request.setAttribute("orderPrice", orderPrice);
		
		RequestDispatcher rd = request.getRequestDispatcher("/jsp/response.jsp");
		rd.forward(request, response);
	}

}
