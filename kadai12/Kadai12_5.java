package kadai12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Kadai12_5 {

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

			System.out.print(count + "回目  ");

			List<Card> hand = new ArrayList<>();

			for (int i = 0; i < 5; i++) {
				hand.add(cards.get(i));
			}

			Collections.sort(hand);


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


			} else if (isStraight && isFlush) {
				System.out.println("★★★★★ストレートフラッシュ★★★★★");

			} else if (isStraight) {
				System.out.println("★★★ストレート★★★");

			} else if (isFlush) {
				System.out.println("★★★フラッシュです★★★");

			}

			int countNumber = 0;
			int countMax = 0;
			int countPair = 0;

			for (int i = 0; i < 13; i++) {
				for (int j = 0; j < 5; j++) {
					if (hand.get(j).number == i + 1) {
						countNumber++;
					}
				}
				countMax = Math.max(countMax, countNumber);


				if (countNumber >= 2) {
					countPair++;
				}

				countNumber = 0;

			}

			if (countMax == 4) {
				System.out.println("★★★★フォーカード★★★★");
				break;

			}else if (countMax == 3 && countPair == 2) {
				System.out.println("★★★フルハウス★★★");


			} else if (countMax == 3) {
				System.out.println("★★★スリーカード★★★");

			} else if (countMax == 2 && countPair == 2) {
				System.out.println("★★ツーペア★★");

			} else if (countMax == 2) {
				System.out.println("★ワンペア★");

			} else{
				System.out.println("×ノーペア×");
			}

			System.out.println();

//			System.out.print("もう一度(y/n):");
//
//			String input = scanner.next();
//
//			System.out.println();
//
//			if (input.equals("n")) {
//				break;
//			}
		}

		System.out.println("\n終了します。");
	}
}
