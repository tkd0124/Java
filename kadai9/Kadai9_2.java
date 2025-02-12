package kadai9;
import kadai9.shape.*;
import java.util.Scanner;

public class Kadai9_2 {
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
			System.out.printf("面積(cm2):%.2f\n", shape.getArea());

			shape.calcPerimeter();
			System.out.printf("外周(cm) :%.2f\n", shape.getPerimeter());
		}
	}
}