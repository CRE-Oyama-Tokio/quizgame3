<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>勝利画面</title>
<link rel="stylesheet" type="text/css" href="QuizGame3.css">
<%@ page import = "model.DragonKing" %>
</head>
<body class="boss">
	<%String playerName = (String)session.getAttribute("playerName"); %>
	<%DragonKing enemy = (DragonKing)session.getAttribute("enemy"); %>
	<%String enemyName = enemy.getEnemyName(); %>
	<div class="img">
	</div>
	<div class="win">
		<%=playerName%>は<%=enemyName%>に勝利した！！
	</div>
</body>
</html>