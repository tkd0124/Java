package k9.shape;

import java.util.Scanner;

public class Maink9_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("図形の種類を選択してください。");
        System.out.println("1：円形, ２：四角形, 3：三角形");
        System.out.print("図形　：");
        int sh = scanner.nextInt();

//        共通親クラスの宣言
//        Shape shape = null;

        Shape shape = switch (sh){
            case 1 -> new Circle(scanner);
            case 2 -> new Rectangle(scanner);
            case 3 -> new Triangle(scanner);
            default -> null;
        };

        if (shape != null) {
            shape.calcArea();
            System.out.println(shape.getArea());
            shape.calcPerimeter();
            System.out.println(shape.getPerimeter());
        }

    }
}
