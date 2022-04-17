<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>レベルアップ画面</title>
<link rel="stylesheet" type="text/css" href="QuizGame3.css">
<%@ page import = "model.Player"%>
<%@ page import = "model.KillerPanther" %>
</head>
<body class="killerPanther">
	<%String playerName = (String)session.getAttribute("playerName"); %>
	<%Player player = (Player)session.getAttribute("player"); %>
	<%int playerHP = player.getHP();%>
	<%int playerAP = player.getAP();%>
	<%KillerPanther enemy = (KillerPanther)session.getAttribute("enemy"); %>
	<%String enemyName = enemy.getEnemyName(); %>
	<div class="img">
	</div>
	<div class="levelupmassage">
		<%=enemyName %>を倒した。<br>
		<%=playerName %>レベルが上がった。<br>
		HPが<%=playerHP %>に上がった。<br>
		攻撃力が<%=playerAP %>に上がった。
		<form action="StatusCall" method="post">
		<input type="submit" value="次の戦い">
	</form>
	</div>
</body>
</html>