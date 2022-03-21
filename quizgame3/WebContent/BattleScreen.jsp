<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>戦闘画面</title>
<link rel="stylesheet" type="text/css" href="Quizgame.css">
</head>
<body>
	<div id="container">
		<div class="status">
			<div class="pStatus">
				<%String playerName = (String)session.getAttribute("playerName"); %>
				<%int playerHP = (Integer)session.getAttribute("playerHP");%>
				<%int playerAP = (Integer)session.getAttribute("playerAP");%>
				<%=playerName %>
				<%=playerHP %>
				<%=playerAP %>
			</div>
			<div class="eStatus">
				<%String enemyName = (String)session.getAttribute("enemyName");%>
				<%int enemyHP = (Integer)session.getAttribute("enemyHP"); %>
				<%int enemyAP = (Integer)session.getAttribute("enemyAP"); %>
				<%=enemyName %>
				<%=enemyHP %>
				<%=enemyAP %>
			</div>
		</div>
		<div class="questions">
			<%String question = (String)session.getAttribute("question"); %>
			<%=question %>
		</div>
		<div class="choices">
			<%String[] ans = (String[])session.getAttribute("ans");%>
			<%=ans[0] %>
			<%=ans[1] %>
			<%=ans[2] %>
		</div>
	</div>

	<form action="GameControl" method="POST">
		<input type="submit" value="1">
		<input type="submit" value="2">
		<input type="submit" value="3">
	</form>

</body>
</html>