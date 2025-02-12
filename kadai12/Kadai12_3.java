package kadai12;

import java.util.*;

public class Kadai12_3 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String[] marks = {"ハート", "ダイヤ", "スペード", "クラブ"};

		List<Card> cards = new ArrayList();


		for (int i = 0; i < marks.length; i++) {

			for (int j = 1; j <= 13; j++) {
				Card card = new Card(j, marks[i]);
				cards.add(card);
			}
		}

		System.out.println("カードを生成しました。");
		for(Card card : cards) {
		}

		while(true) {

			Collections.shuffle(cards);

			System.out.println("カードをシャッフルしました。");

			List<Card> hand = new ArrayList();

			for (int i = 0; i < 5; i++) {
				hand.add(cards.get(i));
			}


			Collections.sort(hand);

			System.out.println("手札をソートしました。");

			System.out.println();

			System.out.print("手札：");

			for (Card card : hand) {
				System.out.print(card.mark + card.number + " ");
			}

			System.out.println("\n");


			System.out.print("もう一度(y/n):");

			String input = scanner.next();

			System.out.println();

			if(input.equals("n")) {
				break;
			}
		}

		System.out.println("終了します。");
	}
}
