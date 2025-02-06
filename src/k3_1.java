package src;

import java.util.Arrays;
import java.util.Scanner;

public class k3_1 {
    public static void main(String[] args) {
        System.out.println("国語、数学、英語の点数を入力してください。");
        Scanner scanner = new Scanner(System.in);

        int[][] scores = new int[3][3];

        for (int i = 0; i < scores.length; i++) {
            System.out.println((i + 1) + "人目");
            System.out.print(" 国語：");
            scores[i][0] = scanner.nextInt();
            System.out.print(" 数学：");
            scores[i][1] = scanner.nextInt();
            System.out.print(" 英語：");
            scores[i][2] = scanner.nextInt();
        }
        System.out.println();
        System.out.println(Arrays.deepToString(scores));
        System.out.println();

        double sum = 0;
        double ave = 0;

        for (int i = 0; i < scores.length; i++){
            for (int j = 0; j < scores[i].length; j++) {
                sum += scores[i][j];
                ave = sum / scores[i].length;
            }
            System.out.println((i + 1) + "人目の合計点と平均点");
            System.out.printf("合計点：" + "%d/300 %n", (int)sum);
            System.out.printf("平均点：" + "%.1f/100 %n", ave);
            System.out.println();

        }

    }
}
