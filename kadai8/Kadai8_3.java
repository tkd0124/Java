package kadai8;

import kadai8.shape.Circle;
import kadai8.shape.Rectangle;
import kadai8.shape.Triangle;

import java.util.Scanner;

public class Kadai8_3 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("図形の種類を選択してください。");
		System.out.println("1. 円形, 2. 四角形, 3. 三角形");
		System.out.print("図形:");
		int sh = scanner.nextInt();

		switch (sh) {
			case 1:
				Circle circle = new Circle();
				circle.calcArea();
				System.out.printf("面積:%.2f", circle.getArea());
				break;
			case 2:
				Rectangle rectangle = new Rectangle();
				rectangle.calcArea();
				System.out.printf("面積:%.2f", rectangle.getArea());
				break;
			case 3:
				Triangle triangle = new Triangle();
				triangle.calcArea();
				System.out.printf("面積:%.2f", triangle.getArea());
				break;
			default:
				System.out.println("不正な値です。");
				break;
		}
	}
}
