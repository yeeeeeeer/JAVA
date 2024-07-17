<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>------------ ! 주문하기 ! ------------</h1>
	<form action="<%= request.getContextPath() %>/menu/order" method="post">
		<select id="menu" name="menuName">
			<option value="초코나무숲">초코나무숲</option>
			<option value="민트초콜릿칩">민트초콜릿칩</option>
			<option value="엄마는외계인">엄마는외계인</option>
			<option value="아몬드봉봉">아몬드봉봉</option>
		</select>	
		<input type="number" min=0 maxlength="100" step="1" name="amount">
		<button type="submit">선택 완료 및 주문</button>
	</form>

</body>
</html>