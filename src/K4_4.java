package src;

import java.util.Scanner;

public class K4_4 {
    public static void main(String[] args) {

        System.out.println("指定した図形の面積や体積を求めます。");
        System.out.println("1 : 正方形");
        System.out.println("1 : 長方形");
        System.out.println("1 : 直方体");

        Scanner scanner = new Scanner(System.in);
        System.out.print("図形を選択してください（1, 2, 3）: ");
        int number = scanner.nextInt();

        System.out.print("縦(cm)：");
        double n1 = scanner.nextDouble();
        System.out.print("横(cm)：");
        double n2 = scanner.nextDouble();
        System.out.print("奥行き(cm)：");
        double n3 = scanner.nextDouble();

        double ans;

        if (number == 1){
            ans = calcArea(n1);
            System.out.printf("正方形の面積は%.2fcm2です。",ans);
        }else if (number == 2) {
            ans = calcArea(n1, n2);
            System.out.printf("長方形の面積は%.2fcm2です。",ans);
        }else {
            ans = calcArea(n1, n2, n3);
            System.out.printf("直方体の体積は%.2fcm3です。",ans);
        }

    }
    public static double calcArea(double height){
        return height * height;
    }
    public static double calcArea(double height, double width){
        return height * width;
    }
    public static double calcArea(double height, double width, double depth){
        return height * width * depth;
    }
}
