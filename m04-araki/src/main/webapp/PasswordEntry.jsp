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
	<form name="login" action="./login" method="post" >
		<div>
			<label>
				ログインID
			</label>
			<input type="text" name="loginID">
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
		
	<!--リクエストスコープにalertがある時の処理-->
	<>
	</form>
</body>
</html>