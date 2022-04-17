package model;

public class Player extends CharaStatus {

	//private int hp;
	//private int ap;
	private int choice;


	public Player() {
		setHP(20);
		setAP(10);
	}

	public int getChoice() {
		return choice;
	}

	public void setChoice(int choice) {
		this.choice = choice;
	}
}
