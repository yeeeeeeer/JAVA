package com.ohgiraffers.response.section03.status;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/status")
public class StatusCodeTestServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 강제 에러 발생시키기 (에러코드 입력, "에러 출력 시 메시지도 넣을 수 있음")
		// response.sendError(404);
		response.sendError(500, "서버 내부 오류 500! 서버 내부 오류는 개발자 잘못이래요..~");
	
	}

}
