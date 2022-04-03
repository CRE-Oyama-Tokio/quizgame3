package model;

public abstract class Enemy extends CharaStatus{


	private String enemyName = null;
	private String ansNum = null;
	private int round;
	private int cnt = 1;

	public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}

	public String getAnsNum() {
		return ansNum;
	}

	public void setAnsNum(String ansNum) {
		this.ansNum = ansNum;
	}

	public String getEnemyName() {
		return enemyName;
	}

	public void setEnemyName(String enemyName) {
		this.enemyName = enemyName;
	}

	public int getRound() {
		return round;
	}

	public void setRound(int round) {
		this.round = round;
	}

	public abstract String quiz(int cnt);


}
