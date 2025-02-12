package kadai12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kadai12_1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("好きな文字列を5個入力してください。");

		List<String> list = new ArrayList<>();

		for (int i = 0; i < 5; i++) {
			System.out.print(i + 1 + "個目:");
			list.add(scanner.nextLine());
		}

		System.out.println("検索する文字列を入力してください。");
		System.out.print("検索文字列:");
		String search = scanner.nextLine();

		if(list.contains(search)) {
			System.out.println("入力された文字列は存在します。");
		}else {
			System.out.println("入力された文字列は存在しません。");
		}
	}
}