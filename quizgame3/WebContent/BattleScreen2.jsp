<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ダメージ画面</title>
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
	</div>
	<%RequestDispatcher rd = request.getRequestDispatcher("StatusCall2.java"); %>
	<%rd.forward(request, response);%>
</body>
</html>