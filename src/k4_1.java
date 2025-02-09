package src;

import java.util.Scanner;

public class k4_1 {
    public static void main(String[] args) {
        System.out.println("三角形の面積を求めます。");

        Scanner scanner = new Scanner(System.in);
        System.out.print("縦（cm）：");
        double t = scanner.nextDouble();
        System.out.print("横（cm）：");
        double y = scanner.nextDouble();

        double squl = calc(t, y);

        System.out.printf("三角形の面積は%.2fです。", squl);
    }
    public static double calc(double num, double num2){
        return num * num2 / 2;
    }
}
