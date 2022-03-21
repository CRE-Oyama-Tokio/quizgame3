package model;

public class DragonKing extends Enemy{

	String[] quiz1 = { "1.エイジ･オブ･ウルトロン", "2.インフィニティ・ウォー", "3.エンドゲーム" };
	String[] quiz2 = { "1.トイ･ストーリー4", "2.アナと雪の女王", "3.アナと雪の女王2" };
	String[] quiz3 = { "1.アナと雪の女王", "2.千と千尋の神隠し", "3.劇場版「鬼滅の刃」無限列車編" };
	String[] quiz4 = { "1.ハウルの動く城", "2.君の名は", "3.もののけ姫" };
	String[] quiz5 = { "1.アベンジャーズ エンドゲーム", "2.アバター", "3.タイタニック" };
	String[] quiz6 = { "1.スカイウォーカーの夜明け", "2.フォースの覚醒", "3.最後のジェダイ"};
	String[] quiz7 = { "1.死の秘宝 PART1", "2.賢者の石", "3.死の秘宝 PART2" };

	public DragonKing() {
		setHP(300);
		setAP(50);
		setEnemyName("竜王");
	}

	//クイズ出題
	@Override
	public String quiz(int cnt) {

		String question = null;
		if(cnt == 1) {
			setAnsNum(3);
			question = "アベンジャーズシリーズで一番興行収入の高い作品は？";
		} else if(cnt == 2) {
			setAnsNum(3);
			question = "選択肢のうち世界で一番興行収入の高い作品は？";
		} else if(cnt == 3) {
			setAnsNum(3);
			question = "選択肢のうち日本で一番興行収入の高い作品は？";
		} else if(cnt == 4) {
			setAnsNum(2);
			question = "選択肢のうち日本で一番興行収入の高い作品は？ ";
		} else if(cnt ==5) {
			setAnsNum(2);
			question = "選択肢のうち世界で一番興行収入の高い作品は？";
		} else if(cnt ==6) {
			setAnsNum(2);
			question = "スターウォーズシリーズで一番興行収入の高い作品は？";
		} else if(cnt ==7) {
			setAnsNum(1);
			question = "ハリー・ポッターシリーズで一番興行収入の高い作品は？";
		}
		return question;
	}

}
