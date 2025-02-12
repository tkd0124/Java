package kadai10;

import kadai10.button.*;

import java.util.Scanner;

public class Kadai10_2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		Button pushButton = new PushButton();
		Button toggleButton = new ToggleButton();

		System.out.println("ボタンの種類を選択してください。");
		System.out.println("1. プッシュボタン, 2. トグルボタン, 0.終了します");
		while(true) {
			System.out.print("ボタン:");
			int bt = scanner.nextInt();

			if(bt == 0) {
				System.out.println("終了します。");
				break;
			}

			switch (bt) {
				case 1:
					pushButton.onClick();
					break;
				case 2:
					toggleButton.onClick();
					break;
				default:
					System.out.println("不正な値です。");
					break;
			}
			System.out.println();
		}
	}
}
