<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>名前入力画面</title>
<link rel="stylesheet" type="text/css" href="QuizGame3.css">
</head>
<body>
	<div class="nameinput">
		<form action="NameInput" method="POST">
			<input type="text" name="playerName" placeholder="名前を入力してください">
			<input type="submit" value="送信">
		</form>
	</div>
</body>
</html>