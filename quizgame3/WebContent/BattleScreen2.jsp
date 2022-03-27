<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
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
	</div>
	<%RequestDispatcher rd = request.getRequestDispatcher("StatusCall2.java"); %>
	<%rd.forward(request, response);%>
</body>
</html>