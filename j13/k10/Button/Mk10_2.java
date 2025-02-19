package k10.Button;

import java.util.Scanner;

public class Mk10_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PushButton pb = new PushButton();
        ToggleButton tb = new ToggleButton();


        System.out.println("ボタンの種類を選択してください。");
        System.out.println("1：プッシュボタン, 2：トグルボタン,3：終了します ");

        while (true) {

            System.out.print("ボタン：");
            int buttonNum = scanner.nextInt();

            if (buttonNum == 1){
                pb.onClick();
                System.out.println();
            } else if (buttonNum == 2) {
                tb.onClick();
//                System.out.println();
//                System.out.println(ToggleButton.getCount());
                System.out.println();
            } else if (buttonNum == 0) {
                System.out.println("終了します。");
                break;
            }
            System.out.println();
        }
    }
}
