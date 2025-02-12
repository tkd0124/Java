package kadai8;

import kadai8.shape.Circle;
import kadai8.shape.Rectangle;
import kadai8.shape.Shape;
import kadai8.shape.Triangle;

import java.util.Scanner;

public class Kadai8_5 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("図形の種類を選択してください。");
		System.out.println("1. 円形, 2. 四角形, 3. 三角形");
		System.out.print("図形:");
		int sh = scanner.nextInt();

		Shape shape = null;

		switch (sh) {
			case 1:
				shape = new Circle();
				break;
			case 2:
				shape = new Rectangle();
				break;
			case 3:
				shape = new Triangle();
				break;
			default:
				System.out.println("不正な値です。");
				break;
		}

		if(shape != null){
			shape.calcArea();
			System.out.printf("面積:%.2f", shape.getArea());
		}
	}
}
