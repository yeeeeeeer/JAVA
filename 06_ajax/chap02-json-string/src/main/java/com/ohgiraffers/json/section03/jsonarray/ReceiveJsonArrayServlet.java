package com.ohgiraffers.json.section03.jsonarray;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/receive/jsonarray")
public class ReceiveJsonArrayServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("application/json; charset=UTF-8");
		
		PrintWriter out = response.getWriter();
		
		out.print("[{\"type\":\"get\",\"firstname\":\"squirrel\",\"lastname\":\"nam\",\"height\":200},"
				+ "{\"type\":\"get\",\"firstname\":\"pig\",\"lastname\":\"jung\",\"height\":300},"
				+ "{\"type\":\"get\",\"firstname\":\"tiger\",\"lastname\":\"lee\",\"height\":500},"
				+ "{\"type\":\"get\",\"firstname\":\"sheep\",\"lastname\":\"kim\",\"height\":170}]");
		out.close();
	
	}

}
