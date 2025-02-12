package kadai12;

import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class User {

	public String name;
	public String password;
	public String email;

	public User(String name, String password, String email) {
		this.name = name;
		this.password = password;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "User{" +
				"name='" + name + '\'' +
				", password='" + password + '\'' +
				", email='" + email + '\'' +
				'}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof User user)) return false;
		return Objects.equals(name, user.name) && Objects.equals(password, user.password);
	}

	public static void registerUser(List<User> userList) {
		Scanner scanner = new Scanner(System.in);

		String name = "";
		String password = "";
		String email = "";

		System.out.println("ユーザー登録を開始します。");
		System.out.print("ユーザー名を入力してください:");
		name = scanner.next();
		System.out.print("パスワードを入力してください:");
		password = scanner.next();
		System.out.print("メールアドレスを入力してください:");
		email = scanner.next();

		for (User user : userList) {
			if (user.getName().equals(name)) {
				System.out.println("そのユーザー名は既に登録されています。");
				return;
			}
		}

		User user = new User(name, password, email);
		userList.add(user);
		System.out.println("ユーザーを登録しました。");

	}

	public static void loginUser(List<User> userList) {
		Scanner scanner = new Scanner(System.in);


		System.out.println("ユーザーログインを開始します。");

		System.out.print("ユーザー名を入力してください:");
		String name = scanner.next();
		System.out.print("パスワードを入力してください:");
		String password = scanner.next();

		User loginUser = new User(name, password, "");

		for (User user : userList) {
			if (user.equals(loginUser)) {
				System.out.println("ログインに成功しました。");
				System.out.println();
				return;
			}
		}
		System.out.println("ユーザー名またはパスワードが間違っています。");
	}
}
