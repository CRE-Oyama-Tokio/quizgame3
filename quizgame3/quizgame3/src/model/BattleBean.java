package model;

import java.io.Serializable;

public class BattleBean implements Serializable{

	private String enemyName;
	private int playerHP;
	private int playerAP;
	private int enemyHP;
	private int enemyAP;
	private String questionNum;
	private String question;
	private String[] ans;


	public BattleBean() {

	}


	public String getEnemyName() {
		return enemyName;
	}


	public void setEnemyName(String enemyName) {
		this.enemyName = enemyName;
	}


	public int getPlayerHP() {
		return playerHP;
	}


	public void setPlayerHP(int playerHP) {
		this.playerHP = playerHP;
	}


	public int getPlayerAP() {
		return playerAP;
	}


	public void setPlayerAP(int playerAP) {
		this.playerAP = playerAP;
	}


	public int getEnemyHP() {
		return enemyHP;
	}


	public void setEnemyHP(int enemyHP) {
		this.enemyHP = enemyHP;
	}


	public int getEnemyAP() {
		return enemyAP;
	}


	public void setEnemyAP(int enemyAP) {
		this.enemyAP = enemyAP;
	}


	public String getQuestionNum() {
		return questionNum;
	}


	public void setQuestionNum(String questionNum) {
		this.questionNum = questionNum;
	}


	public String getQuestion() {
		return question;
	}


	public void setQuestion(String question) {
		this.question = question;
	}


	public String[] getAns() {
		return ans;
	}


	public void setAns(String[] ans) {
		this.ans = ans;
	}

}
