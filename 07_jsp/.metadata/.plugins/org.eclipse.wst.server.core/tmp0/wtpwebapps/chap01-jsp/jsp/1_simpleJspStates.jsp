<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>simple JSP states</title>
</head>
<body>

	<%-- 주석 태그 --%>
	<!-- HTML 주석 태그는 클라이언트에게 노출되지만(개발자도구) -->
	<%-- JSP 주석 태그는 클라이언트에게 노출되지 않음 --%>

	<%-- 선언 태그 (필드) --%>
	<%!
		private String name;
		private int age;
		%>

	<%-- 스크립틀릿 태그 (scriptlet) (자바코드 사용가능) --%>
	<%
		// 주석 사용가능
		name = "다람쥐";
		age = 900;

		System.out.println("name: " + name);
		System.out.println("age: " + age);

		for (int i = 0; i < name.length(); i++) {
			System.out.println(name.charAt(i));
		}
	%>
	
	<%-- expression 태그 (자바에서 사용한 변수의 값을 꺼낸다) --%>
	name: <%= name %><br>
	age: <%= age %><br>
	


</body>
</html>