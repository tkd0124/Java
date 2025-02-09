package src;

import java.util.Arrays;
import java.util.Scanner;

public class k3_5 {
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
            String y = scanner.nextLine();
            System.out.print("パスワード：");
            String p = scanner.nextLine();

            boolean isLoggedIn = false;
            for (String[] account : array){
                String username = account[0];
                String password = account[1];
                if (username.equals(y) && password.equals(p)){
                    isLoggedIn = true;
                    break;
                }
            }

            if (isLoggedIn){
                System.out.println("ログイン成功");
                break;
            }else {
                System.out.println("ログイン失敗");
            }
//            String p = scanner.nextLine();

//            boolean ty = false;
//            boolean tp = false;

//            for (String[] i : array) {
//
//                for (String j : i) {
//                    if (j.equals(y)) {
//                        ty = true;
//                    }
//                    if (j.equals(p)) {
//                        tp = true;
//                    }
//                    if (ty && tp) {
//                        System.out.println("ログイン成功");
//                        t = false;
//                        break;
//                    }
//                }
//            }
//            System.out.println("ログイン失敗");
        }
        scanner.close();
    }

}
