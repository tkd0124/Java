package kadai12;

import java.util.ArrayList;
import java.util.List;

public class Kadai12_2 {

	public static void main(String[] args) {

		String[] marks = {"ハート", "ダイヤ", "スペード", "クラブ"};

		List<Card> cards = new ArrayList();


		for (int i = 0; i < marks.length; i++) {

			for (int j = 1; j <= 13; j++) {
				Card card = new Card(j, marks[i]);
				card.number = j;
				card.mark = marks[i];
				cards.add(card);
			}
		}

		System.out.println("カードを生成しました。");
		for(Card card : cards) {
			System.out.println(card.mark + card.number);
		}


	}
}
