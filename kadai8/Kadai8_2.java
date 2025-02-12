package kadai8;

import kadai8.shape.Circle;
import kadai8.shape.Rectangle;
import kadai8.shape.Triangle;

import java.util.Scanner;

public class Kadai8_2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("図形の種類を選択してください。");
		System.out.println("1. 円形, 2. 四角形, 3. 三角形");
		System.out.print("図形:");
		int sh = scanner.nextInt();

		switch (sh) {
		case 1:
			Circle circle = new Circle();
			break;
		case 2:
			Rectangle rectangle = new Rectangle();
			break;
		case 3:
			Triangle triangle = new Triangle();
			break;
		default:
			System.out.println("不正な値です。");
			break;
		}
	}
}
