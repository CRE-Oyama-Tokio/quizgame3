package model;

import java.io.Serializable;

public class BattleBean implements Serializable{

	private String eName;
	private int php;
	private int pap;
	private int ehp;
	private int eap;
	private String questionNum;
	private String question;
	private String[] choices;


	public BattleBean() {

	}


	public String geteName() {
		return eName;
	}


	public void seteName(String eName) {
		this.eName = eName;
	}


	public int getPhp() {
		return php;
	}


	public void setPhp(int php) {
		this.php = php;
	}


	public int getPap() {
		return pap;
	}


	public void setPap(int pap) {
		this.pap = pap;
	}


	public int getEhp() {
		return ehp;
	}


	public void setEhp(int ehp) {
		this.ehp = ehp;
	}


	public int getEap() {
		return eap;
	}


	public void setEap(int eap) {
		this.eap = eap;
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


	public String[] getChoices() {
		return choices;
	}


	public void setChoices(String[] choices) {
		this.choices = choices;
	}

}
