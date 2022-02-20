<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>戦闘画面</title>
</head>
<body>
	【ルール説明】<br>
	敵が出すクイズに答えて攻撃しよう。<br>
	答えるときは選択肢の番号を半角で打ち込もう。<br>
	竜王を倒せたらプレイヤーの勝利。<br>
	<br>

	<jsp:useBean id="battle" scope="request" class="model.BattleBean"/>

	<jsp:getProperty name="battle" property="eName"/>が現れた<br>
	プレイヤー<br>
	HP:<jsp:getProperty name="battle" property="php"/><br>
	攻撃力:<jsp:getProperty name="battle" property="pap"/><br>
	<br>
	<jsp:getProperty name="battle" property="eName"/><br>
	HP:<jsp:getProperty name="battle" property="ehp"/><br>
	攻撃力:<jsp:getProperty name="battle" property="eap"/><br>
	<br>
	<jsp:getProperty name="battle" property="questionNum"/><br>
	<jsp:getProperty name="battle" property="question"/><br>


	<form action="GameControl" method="POST">



	</form>

</body>
</html>