package model;

public class KillerPanther extends Enemy{


	private String[] quiz1 = { "1.ドウェイン・ジョンソン", "2.キアヌ・リーブス", "3.オーランド・ブルーム" };
	private String[] quiz2 = { "1.ブルース・ウィリス", "2.ジョニー・デップ", "3.ジェイソン・ステイサム" };
	private String[] quiz3 = { "1.トム・ハンクス", "2.トム・クルーズ", "3.トム・ホランド" };
	private String[] quiz4 = {"1.イラジャ・ウッド", "トビー・マグワイア", "3.ダニエル・ラドクリフ"};

	public KillerPanther() {
		setHP(75);
		setAP(20);
		setEnemyName("キラーパンサー");
	}

	public String[] getQuiz1() {
		return quiz1;
	}

	public void setQuiz1(String[] quiz1) {
		this.quiz1 = quiz1;
	}

	public String[] getQuiz2() {
		return quiz2;
	}

	public void setQuiz2(String[] quiz2) {
		this.quiz2 = quiz2;
	}

	public String[] getQuiz3() {
		return quiz3;
	}

	public void setQuiz3(String[] quiz3) {
		this.quiz3 = quiz3;
	}

	public String[] getQuiz4() {
		return quiz4;
	}

	public void setQuiz4(String[] quiz4) {
		this.quiz4 = quiz4;
	}

	public String quiz(int cnt) {
		setAnsNum(2);
		String question = null;
		if(cnt == 1) {
			question = "映画「マトリックス」の主演俳優は？";
		} else if(cnt == 2 ) {
			question = "映画「ダイハード」の主演俳優は？";
		} else if(cnt == 3) {
			question = "映画「フォレスト･ガンプ」の主演俳優は？";
		} else if(cnt == 4) {
			question = "映画「ハリー・ポッター」の主演俳優は？";
		}
		return question;

	}
}
