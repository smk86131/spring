<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	window.onload = function() {
		alert('윈도우 다 부르고 나서 함수 실행');
		var send = document.getElementById('send');
		alert(send);
	}
</script>
<script src="jquery-3.5.1.min.js"></script>
<script type="text/javascript">
	$(document).ready(function(){
		alert('윈도우 다 부르고 나서 실행');
		var send = $('#send')
		alert(send);
	});
</script>
</head>
<body>
<!-- 
	spring
	프론트엔드
	html,css,javascript,jqeury
	mysql
	백엔드
	java언어,jsp
	tomcat개발환경
	react.js

 	c#
 	참조 
 	devExpress
 	Spread
 	
  -->
<h1>insert</h1>
<form action="insertProc" method="post">
	<input type="text" name="para1"/>
	<input type="text" name="para2"/>
	<input type="submit" value="전송"/>
</form>
</body>
</html>