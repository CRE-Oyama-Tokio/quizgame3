<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="QuizGame3.css">
<%@ page import = "model.Player"%>
<%@ page import = "model.KillerPanther" %>
</head>
<body class="killerPanther">
	<audio src="attack_killerpanther.mp3" autoplay></audio>
	<%String playerName = null; %>
	<%int enemyAP; %>
	<%String enemyImg = null; %>
	<div id="container">
		<div class="status">
			<div class="pStatus">
				<%playerName = (String)session.getAttribute("playerName"); %>
				<%Player player = (Player)session.getAttribute("player"); %>
				<%int playerHP = player.getHP();%>
				<%int playerAP = player.getAP();%>
				<%=playerName %>
				HP:<%=playerHP %>
				攻撃力:<%=playerAP %>
			</div>
			<div class="eStatus">
				<%KillerPanther enemy = (KillerPanther)session.getAttribute("enemy"); %>
				<%String enemyName = enemy.getEnemyName(); %>
				<%int enemyHP = enemy.getHP(); %>
				<%enemyAP = enemy.getAP(); %>
				<%int cnt = enemy.getCnt(); %>
				<%enemyImg = enemy.getImg(); %>
				<%=enemyName %>
				HP:<%=enemyHP %>
				攻撃力:<%=enemyAP %>
			</div>
		</div>
		<div class="img">
			<img src=<%=enemyImg%>>
		</div>
		<div class="damagemassage">
			残念。
			<%=playerName%>に<%=enemyAP%>のダメージ！
			<form action="StatusCall2" method="post" class="next">
				<input type="submit" value="next">
			</form>
		</div>
	</div>
</body>
</html>