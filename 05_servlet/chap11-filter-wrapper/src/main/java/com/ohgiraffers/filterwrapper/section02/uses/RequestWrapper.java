package com.ohgiraffers.filterwrapper.section02.uses;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletRequestWrapper;

public class RequestWrapper extends HttpServletRequestWrapper {

	public RequestWrapper(HttpServletRequest request) {
		super(request);
	}

	@Override
	public String getParameter(String name) {
		
		String value = "";
		
		if("password".equals(name)) {
			//암호화 객체 만듬
			BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
			// 암호화대상을 암호화한다 -> 리턴값에 담아주기
			value = passwordEncoder.encode(super.getParameter(name));
			
		}else {
			value = super.getParameter(name);
		}
		return value;
	}
	
}
