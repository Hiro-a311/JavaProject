<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>顧客情報入力</title>
</head>
<body>
	<h1>顧客情報入力</h1>
	<form name="list" action="./customer" method="post">
	 	
	 	<h2>名前</h2>
	 	<input type="text" name="name" />
	 	
	 	<h2>ニックネーム</h2>
	 	<input type="text" name="nickname" />
	 	
	 	<h2>性別</h2>
	 	<input type="radio" name="gender" value="empty" checked>未指定<br>
	 	<input type="radio" name="gender" value="male">男性<br>
	 	<input type="radio" name="gender" value="female">女性<br>
	 
	 	<h2>住所</h2>
	 	<input type="text" name="address" />
	 	
	 	<h2>勤務先</h2>
	 	<input type="text" name="workplace" />
	 	<input type="submit" value="送信">
	 </form>
	<list>
		
	</list>
</body>
</html>