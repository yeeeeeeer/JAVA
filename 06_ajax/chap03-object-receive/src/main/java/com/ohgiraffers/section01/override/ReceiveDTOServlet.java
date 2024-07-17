package com.ohgiraffers.section01.override;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import com.ohgiraffers.model.dto.MemberDTO;

@WebServlet("/receive/override")
public class ReceiveDTOServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		MemberDTO member = new MemberDTO("get", "squirrel", "nam", 200);

		response.setContentType("application/json; charset=UTF-8");
		PrintWriter out = response.getWriter();

		out.print(member);
		// 위와 아래는 같은 코드임
//		out.print(member.toString());
		out.close();

	}
}
