package com.ohgiraffers.json.section01.jsonstring;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/receive/json")
public class ReceiveJsonStringServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		
		out.print("{\"type\":\"get\",\"firstname\":\"squirrel\",\"lastname\":\"nam\",\"height\":200}");
		out.close();
	}
}
