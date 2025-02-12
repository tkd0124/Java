package kadai11;

import java.util.Scanner;

public class Kadai11_1 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);


		System.out.println("年齢を入力してください。");


		int num = 0;


		while (true) {
			try {
				System.out.print("年齢:");
				num = scanner.nextInt();

				if (num < 0) {
					System.out.println("負の値が入力されました。");
				}else{
					break;
				}
			} catch (Exception e) {
				System.out.println("整数以外の値が入力されました。");
				scanner.next();
			}
		}

		System.out.println("あなたの年齢は" + num + "歳です。");
	}
}
