package model;

public class KillerPanther extends Enemy{


	private String[] ans1 = { "1.ドウェイン・ジョンソン", "2.キアヌ・リーブス", "3.オーランド・ブルーム" };
	private String[] ans2 = { "1.ブルース・ウィリス", "2.ジョニー・デップ", "3.ジェイソン・ステイサム" };
	private String[] ans3 = { "1.トム・ハンクス", "2.トム・クルーズ", "3.トム・ホランド" };
	private String[] ans4 = { "1.イラジャ・ウッド", "2.トビー・マグワイア", "3.ダニエル・ラドクリフ"};

	public KillerPanther() {
		setHP(75);
		setAP(20);
		setEnemyName("キラーパンサー");
		setImg("XPhPh1lwq00BPZP1650034899_16500349.png");
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
		else if(cnt == 4) {
			ans = ans4;
		}
		return ans;
	}


	public String[] getAns1() {
		return ans1;
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

	public String[] getAns4() {
		return ans4;
	}

	public void setAns4(String[] ans4) {
		this.ans4 = ans4;
	}

	public String quiz(int cnt) {

		String question = null;
		if(cnt == 1) {
			setAnsNum(2);
			question = "映画「マトリックス」の主演俳優は？";
		} else if(cnt == 2 ) {
			setAnsNum(1);
			question = "映画「ダイハード」の主演俳優は？";
		} else if(cnt == 3) {
			setAnsNum(1);
			question = "映画「フォレスト･ガンプ」の主演俳優は？";
		} else if(cnt == 4) {
			setAnsNum(3);
			question = "映画「ハリー・ポッター」の主演俳優は？";
		}
		return question;

	}
}
