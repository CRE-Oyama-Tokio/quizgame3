<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>敗北画面</title>
<link rel="stylesheet" type="text/css" href="QuizGame3.css">
</head>
<body>
	<%String playerName = (String)session.getAttribute("playerName"); %>
	<div class="img">
	</div>
	<div class="dead">
		<%=playerName %>は死んでしまった。
	</div>
</body>
</html>