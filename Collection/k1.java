package Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class k1 {
    public static void main(String[] args) {
        System.out.println("好きな文字列を5個入力してください。");

        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>();

        list.add("abc");
        for (int i = 1; i <= 5; i++){
            System.out.print(i + "個目：");
            String str = scanner.nextLine();

            list.add(str);
        }
        while (true) {
            System.out.println("検索する文字列を入力してください。");
            System.out.print("検索文字列：");
            String str1 = scanner.nextLine();

            if (list.contains(str1)) {
                System.out.println("入力された文字列は存在します");
                break;
            } else {
                System.out.println("入力された文字列は存在しません");
            }
        }
//
//        System.out.println(list);
    }
}
