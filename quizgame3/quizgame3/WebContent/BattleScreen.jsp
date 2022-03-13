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
				<%int playerHP = (Integer)request.getAttribute("playerHP");%>
				<%int playerAP = (Integer)request.getAttribute("playerAP"); %>
				<%=playerHP %>
				<%=playerAP %>
			</div>
			<div class="eStatus">
				<%String enemyName = (String)request.getAttribute("enemyName");%>
				<%int enemyHP = (Integer)request.getAttribute("enemyHP"); %>
				<%int enemyAP = (Integer)request.getAttribute("enemyAP"); %>
				<%=enemyName %>
				<%=enemyHP %>
				<%=enemyAP %>
			</div>
		</div>

		<div class="questions">
			<%String question = (String)request.getAttribute("question"); %>
			<%String ans = (String)request.getAttribute("ans"); %>
			<%=question %>
			<%=ans %>
		</div>
	</div>

	<form action="GameControl" method="POST">
		<input type="submit" value="1">
		<input type="submit" value="2">
		<input type="submit" value="3">
	</form>

</body>
</html>