package model;

public class Slime extends Enemy {

	private String[] ans1 = { "1.孫悟空", "2.孫悟飯", "3.孫悟天" };
	private String[] ans2 = { "1.流川楓", "2.安西光義", "3.桜木花道" };
	private String[] ans3 = { "1.我妻善逸", "2.竈門炭治郎", "3.嘴平伊之助" };


	public Slime() {
		setEnemyName("スライム");
		setHP(20);
		setAP(10);
		setImg("LPPQ3S4dTBrlbaT1650034704_1650034713.png");
	}

	public String[] getAns(int cnt) {

		String[] ans = null;
		if(cnt == 1) {
			ans = ans1;
		} else if(cnt == 2) {
			ans = ans2;
		} else if(cnt == 3) {
			ans = ans3;
		}
		return ans;
	}

	public void setAns1(String[] ans1) {
		this.ans1 = ans1;
	}

	public String[] getAns2() {
		return ans2;
	}

	public void setAns2(String[] ans2) {
		this.ans2 = ans2;
	}

	public String[] getAns3() {
		return ans3;
	}

	public void setAns3(String[] ans3) {
		this.ans3 = ans3;
	}

	public String quiz(int cnt) {
		String question = null;
		if(cnt == 1) {
			setAnsNum(1);
			question = "ドラゴンボールの主人公は？";
		} else if(cnt == 2) {
			setAnsNum(3);
			question = "スラムダンクの主人公は？";
		} else if(cnt == 3) {
			setAnsNum(2);
			question = "鬼滅の刃の主人公は？";
		}
		return question;
	}
}