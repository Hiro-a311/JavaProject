<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ログイン</title>
</head>
<body>
	ログイン<br>
	<form name="login" action="PasswordServlet" method="post" >
		<div>
			<label>
				ログインID
			</label>
			<input type="text" name="loginId">
		</div>
		<div>
			<label>
				パスワード
			</label>
			<input type="text" name="password">
		</div>
		<div>
			<label>
				<input type="submit" name="送信"> 
			</label>
		</div>
		
		<!--リクエストスコープにmessageがある時の処理-->
		<%
			String message = (String)request.getAttribute("message");
				if(message != null){
					out.println(message);
				} 
		%>
	</form>
</body>
</html>