<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>GET 방식의 요청</h3>
	<h4>form 태그의 method 속성을 get으로 설정</h4>
	<form action="repuest-practice" method="get">
		<input type="submit" value="GET 방식 요청">
	</form>

<br>

<h3>POST 방식의 요청</h3>
	<h4>form 태그의 method 속성을 post로 설정</h4>
	<form action="repuest-practice" method="post">
		<input type="submit" value="POST 방식 요청">
	</form>

</body>
</html>