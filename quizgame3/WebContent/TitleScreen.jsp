<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>タイトル画面</title>
</head>
<body>
	<h1>クイズゲーム</h1>
	<form action="StatusCall" method="POST">
		<input type="submit" value="ゲーム開始"><br>
		<a href="NameInput.jsp">名前を変更する</a>
		<%//String playerName = (String)session.getAttribute("playerName"); %>
		<%//session.setAttribute("playerName",playerName); %>
	</form>
</body>
</html>