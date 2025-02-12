package kadai12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Kadai12_4 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String[] marks = {"ハート", "ダイヤ", "スペード", "クラブ"};

		List<Card> cards = new ArrayList<>();


		for (String mark : marks) {

			for (int j = 1; j <= 13; j++) {
				Card card = new Card(j, mark);
				cards.add(card);
			}
		}

		System.out.println("カードを生成しました。");


		for (int count = 1; ; count++) {

			Collections.shuffle(cards);

			System.out.println(count + "回目");
			System.out.println("カードをシャッフルしました。");

			List<Card> hand = new ArrayList<>();

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

			// ストレートの判定
			boolean isStraight = true;
			boolean isFlush = true;


			for (int i = 0; i < 4; i++) {
				if (hand.get(i).number + 1 != hand.get(i + 1).number) {
					isStraight = false;
				}
				if (!hand.get(i).mark.equals(hand.get(i + 1).mark)) {
					isFlush = false;
				}

			}

			if (isFlush && hand.get(0).number == 1 && hand.get(1).number == 10 && hand.get(2).number == 11 && hand.get(3).number == 12 && hand.get(4).number == 13) {
				System.out.println("★★★★★★ロイヤルストレートフラッシュ★★★★★★");
				break;

			} else if (isStraight && isFlush) {
				System.out.println("★★★★★ストレートフラッシュ★★★★★");

			} else if (isStraight) {
				System.out.println("★★★ストレート★★★");

			} else if (isFlush) {
				System.out.println("★★★フラッシュです★★★");

			}

//			System.out.print("もう一度(y/n):");
//
//			String input = scanner.next();
//
//			System.out.println();
//
//			if(input.equals("n")) {
//				break;
//			}
		}

		System.out.println("終了します。");
	}
}
