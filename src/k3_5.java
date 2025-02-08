package src;

import java.util.Arrays;
import java.util.Scanner;

public class k3_5{
    public static void main(String[] args) {
        String[][] array = {
                {"tanaka", "tpass"},
                {"suzuki", "aupass"},
                {"sato", "spass"},
        };
        System.out.println("accounts = " + Arrays.deepToString(array));

        System.out.println("ユーザ名とパスワードを入力してください。");

        Scanner scanner = new Scanner(System.in);



        while (true) {
            System.out.print("ユーザ名：");
            String y = scanner.next();
            System.out.print("パスワード：");
            String p = scanner.next();
            for (int i = 0; i < array.length; i++) {
                if (array[i][0].equals("y") && array[i][1].equals("p")) {
                    System.out.println("ログイン成功");
                    break;
                } else {
                    System.out.println("ログイン失敗");

                }
                break;
            }
        }


    }
}
