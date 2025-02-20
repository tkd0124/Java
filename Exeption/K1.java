package Exeption;

import java.util.Scanner;

public class K1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("年齢を入力してください");

        while (true){
            System.out.print("年齢：");
            String str = scanner.nextLine();
            try {
                int age = Integer.parseInt(str);//ここがキャッチ部分

                if (age >= 0) {
                    System.out.println("あなたの年齢は" +
                            age + "才です。");
                    break;
                }else {
                    System.out.println("負の値が入力されました");
                    continue;
                }
            }catch (NumberFormatException e){
                System.out.println("整数以外の値が入力されました");
            }
        }
    }
}
