package com.ohgiraffers.eljstl.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.ohgiraffers.eljstl.model.dto.MemberDTO;

@WebServlet("/test2")
public class TestTwoServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	MemberDTO member = new MemberDTO("다람쥐", 900, "010-2222-3333", "squirrel@ohgiraffers.com");
	request.setAttribute("member", member);
	
	RequestDispatcher view = request.getRequestDispatcher("view/el/testEl2.jsp");
	view.forward(request, response);
		
	}

}
