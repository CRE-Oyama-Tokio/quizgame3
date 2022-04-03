<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>戦闘画面</title>
<link rel="stylesheet" type="text/css" href="Quizgame.css">
<%@ page import = "model.Player"%>
<%@ page import = "model.Slime" %>
</head>
<body>
	<div id="container">
		<div class="status">
			<div class="pStatus">
				<%String playerName = (String)session.getAttribute("playerName"); %>
				<%Player player = (Player)session.getAttribute("player"); %>
				<%int playerHP = player.getHP();%>
				<%int playerAP = player.getAP();%>
				<%=playerName %>
				<%=playerHP %>
				<%=playerAP %>
			</div>
			<div class="eStatus">
				<%Slime slime = (Slime)session.getAttribute("slime"); %>
				<%String enemyName = slime.getEnemyName(); %>
				<%int enemyHP = slime.getHP(); %>
				<%int enemyAP = slime.getAP(); %>
				<%int round = slime.getRound(); %>
				<%int cnt = slime.getCnt(); %>
				<%=enemyName %>
				<%=enemyHP %>
				<%=enemyAP %>
				<%=round %>
			</div>
		</div>
		<div class="questions">
			<%String question = slime.quiz(cnt); %>
			<%=question %>
		</div>
		<div class="choices">
			<%String[] ans = slime.getAns(cnt);%>
			<%=ans[0] %>
			<%=ans[1] %>
			<%=ans[2] %>
		</div>
	</div>

	<form action="GameControl" method="POST">
		<button type="submit" name="choice" value="1">1</button>
		<button type="submit" name="choice" value="2">2</button>
		<button type="submit" name="choice" value="3">3</button>
	</form>

</body>
</html>