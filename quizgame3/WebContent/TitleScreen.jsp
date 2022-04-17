<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>タイトル画面</title>
<link rel="stylesheet" type="text/css" href="QuizGame3.css">
</head>
<body class="titlescreen">
	<div class="title">
		<h1>クイズクエスト</h1>
	</div>
	<div class="start">
		<form action="StatusCall" method="POST" >
			<input type="submit" value="ゲーム開始" class="button"><br>
			<a href="NameInput.jsp">名前を変更する</a>
		</form>
	</div>
</body>
</html>