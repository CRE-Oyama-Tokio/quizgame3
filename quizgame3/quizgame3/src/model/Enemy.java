package model;

public abstract class Enemy extends CharaStatus{


	private String enemyName;
	private int ansNum;



	public int getAnsNum() {
		return ansNum;
	}

	public void setAnsNum(int ansNum) {
		this.ansNum = ansNum;
	}

	public String getEnemyName() {
		return enemyName;
	}

	public void setEnemyName(String enemyName) {
		this.enemyName = enemyName;
	}

	public abstract String quiz(int cnt);


}
