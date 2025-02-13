package Parity;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("元データ：");
        String data = scanner.nextLine();
        System.out.println();

        ParityCheck pCheck = new ParityCheck();

        // 偶数パリティの場合のパリティビット計算
        char evenParityBit = pCheck.calculateParityBit(data, true);
        System.out.printf("偶数パリティの場合,%n" + "すでに1の数が偶数なら、パリティビットは'0'%n" +
                "奇数なら、'1'を追加して偶数にする%n");
        System.out.println();
        System.out.println("偶数パリティビット: " + evenParityBit);
        System.out.println("偶数パリティの送信データ: " + data +  " " + evenParityBit);
        System.out.println();
        // 奇数パリティの場合のパリティビット計算
        char oddParityBit = pCheck.calculateParityBit(data, false);
        System.out.println("奇数パリティビット: " + oddParityBit);
        System.out.println("奇数パリティの送信データ: " + data + " " + oddParityBit);

    }
}
