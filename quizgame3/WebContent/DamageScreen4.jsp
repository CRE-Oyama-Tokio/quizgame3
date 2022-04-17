<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="QuizGame3.css">
<%@ page import = "model.Player"%>
<%@ page import = "model.DragonKing" %>
</head>
<body class="boss">
	<audio src="attack_player.mp3" autoplay></audio>
	<%String enemyName = null; %>
	<%int playerAP; %>
	<%String enemyImg = null; %>
	<div id="container">
		<div class="status">
			<div class="pStatus">
				<%String playerName = (String)session.getAttribute("playerName"); %>
				<%Player player = (Player)session.getAttribute("player"); %>
				<%int playerHP = player.getHP();%>
				<%playerAP = player.getAP();%>
				<%=playerName %>
				HP:<%=playerHP %>
				攻撃力:<%=playerAP %>
			</div>
			<div class="eStatus">
				<%DragonKing enemy = (DragonKing)session.getAttribute("enemy"); %>
				<%enemyName = enemy.getEnemyName(); %>
				<%int enemyHP = enemy.getHP(); %>
				<%int enemyAP = enemy.getAP(); %>
				<%int cnt = enemy.getCnt(); %>
				<%enemyImg = enemy.getImg(); %>
				<%=enemyName %>
				HP:<%=enemyHP %>
				攻撃力:<%=enemyAP %>
			</div>
		</div>
		<div class="img">
			<img src=<%=enemyImg %>>
		</div>
		<div class="damagemassage">
			正解！
			<%=enemyName%>に<%=playerAP%>のダメージ！
			<form action="StatusCall2" method="post" class="next">
				<input type="submit" value="next">
			</form>
		</div>
	</div>
</body>
</html>