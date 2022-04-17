<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>戦闘画面</title>
<link rel="stylesheet" type="text/css" href="QuizGame3.css">
<%@ page import="model.Player"%>
<%@ page import="model.DragonKing"%>
</head>
<body class="boss">
	<%String enemyImg = null; %>
	<div id="container">
		<div class="status">
			<div class="pStatus">
				<%String playerName = (String)session.getAttribute("playerName"); %>
				<%Player player = (Player)session.getAttribute("player"); %>
				<%int playerHP = player.getHP();%>
				<%int playerAP = player.getAP();%>
				<%=playerName %>
				HP:<%=playerHP %>
				攻撃力:<%=playerAP %>
			</div>
			<div class="eStatus">
				<%DragonKing enemy = (DragonKing)session.getAttribute("enemy"); %>
				<%String enemyName = enemy.getEnemyName(); %>
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
		<div class="quizset">
			<div class="quiz">
				<div class="questions">
					<%String question = enemy.quiz(cnt); %>
					<%=question %>
				</div>
				<div class="choices">
					<%String[] ans = enemy.getAns(cnt);%>
					<%=ans[0] %><br>
					<%=ans[1] %><br>
					<%=ans[2] %>
				</div>
			</div>
			<div class="choiceset">
				<form action="GameControl" method="POST" class="choice">
					<button type="submit" name="choice" value=1>1</button>
					<button type="submit" name="choice" value=2>2</button>
					<button type="submit" name="choice" value=3>3</button>
				</form>
			</div>
		</div>
	</div>
</body>
</html>