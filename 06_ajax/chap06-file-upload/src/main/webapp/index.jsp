<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ajax file upload</title>
<script src="https://code.jquery.com/jquery-3.7.1.min.js" integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo=" crossorigin="anonymous"></script>
</head>
<body>

	<h1>AJAX file upload (formdata 이용)</h1>
	
	<input type="file" id="file"><br>
	<input type="text" id="description"><br>
	<input type="button" value="파일 전송" id="send-file">
	
	<script>
		$("#send-file").click(function(){
			
			const formData = new FormData();  // 자바스크립스 "객체"
			
			formData.append("file", $("#file")[0].files[0]);
			formData.append("description", $("#description").val());
			
			
			$.ajax({
				url: "/chap06/commons",
				type: "post",
				data: formData,   // data에 객체 전송 가능
				contentType: false,
				processData: false,
				success: function(data){
					alert(data);
				},
				error: function(error){
					console.log(error);
				}
			});
		});
		
	</script>
	

</body>
</html>