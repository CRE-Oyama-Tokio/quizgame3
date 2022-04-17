package model;

public class Golem extends Enemy{

	String[] ans1 = { "1.リリー・コリンズ", "2.アン・ハサウェイ", "3.レイチェル・マクアダムス" };
	String[] ans2 = { "1.アンジェリーナ・ジョリー", "2.ナタリー・ポートマン", "3.スカーレット・ヨハンソン" };
	String[] ans3 = { "1.エマ・ストーン", "2.エマ・ロバーツ", "3.エマ・ワトソン" };
	String[] ans4 = { "1.アンジェリーナ・ジョリー", "2.ナタリー・ポートマン", "3.スカーレット・ヨハンソン" };
	String[] ans5 = { "1.ミラ・ジョヴォビッチ", "2.キャメロン・ディアス", "3.キーラ・ナイトレイ" };

	public Golem() {
		setHP(150);
		setAP(35);
		setEnemyName("ゴーレム");
		setImg("bCtcsG2bFJvPfXV165003497.png");
	}

	public String[] getAns(int cnt) {

		String[] ans = null;
		if(cnt == 1) {
			ans = ans1;
		} else if(cnt == 2) {
			ans = ans2;
		} else if(cnt == 3) {
			ans = ans3;
		} else if(cnt == 4) {
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

	public String[] getAns5() {
		return ans5;
	}

	public void setAns5(String[] ans5) {
		this.ans5 = ans5;
	}

	//クイズ出題
	@Override
	public String quiz(int cnt) {

		String question = null;
		if(cnt == 1) {
			setAnsNum(2);
			question = "映画「プラダを着た悪魔」の主演女優は？";
		} else if(cnt == 2) {
			setAnsNum(1);
			question = "映画「マレフィセント」の主演女優は？";
		} else if(cnt == 3) {
			setAnsNum(3);
			question = "映画「美女と野獣」の主演女優は？";
		} else if(cnt == 4) {
			setAnsNum(1);
			question = "映画「トゥームレイダー」の主演女優は？ ";
		} else if(cnt ==5) {
			setAnsNum(1);
			question = "映画「バイオハザード」の主演女優は？";
		}

		return question;
	}

}