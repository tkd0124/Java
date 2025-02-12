package kadai12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kadai12_6 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		List<User> userList  = new ArrayList<>();

		while(true) {
			System.out.println("操作を選択してください");
			System.out.println("１：ユーザー登録");
			System.out.println("２：ユーザーログイン");
			System.out.println("３：終了");

			System.out.print("操作:");
			int select = scanner.nextInt();

			System.out.println();

			if(select == 1) {
				User.registerUser(userList);
			} else if(select == 2) {
				User.loginUser(userList);
			}else if(select == 3) {
				System.out.println("終了します。");
				break;
			}else{
				System.out.println("不正な操作です。");
			}
			System.out.println();
		}
	}
}
