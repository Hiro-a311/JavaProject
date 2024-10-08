<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>顧客情報</title>
</head>
<body>
	<h1>顧客情報</h1>
	<%
        // リクエストスコープから値を取り出す
        String name = (String)request.getAttribute("name");
        String address = (String)request.getAttribute("address");
        String nickname = (String)request.getAttribute("nickname");
        String workplace = (String)request.getAttribute("workplace");
    %>
    	 <!-- 取得した値を表示する -->
    	<p>名前：<%=name %></p>
    	<p>住所：<%=address %></p>
    	<p>ニックネーム：<%=nickname %></p>
    	<p>勤務先：<%=workplace %></p>
    
</body>
</html>