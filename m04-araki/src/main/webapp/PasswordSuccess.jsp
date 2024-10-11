<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	ログイン成功☆ '3'
	
<%
String message = (String)request.getAttribute("message");
if(message != null){
	out.println(message);
}
%>
</body>
</html>