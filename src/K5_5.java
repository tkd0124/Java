package src;

import java.util.Scanner;

public class K5_5 {
    public static void main(String[] args) {

        System.out.println("入力する生徒の人数を指定してください。");
        int member;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("人数：");
            member = scanner.nextInt();
            scanner.nextLine();
            if (0 < member && member < 6) {
                break;
            }
            System.out.println("1 ~ 5の数値を入力してください。");
        }

        System.out.println(member + "人の生徒の情報を入力してください。");

        Student[] array = new Student[member];

        for (int i = 0; i < member; i++){
            System.out.print("名前：");
            String name = scanner.nextLine();

            System.out.print("身長：");
            double height = scanner.nextDouble();
            scanner.nextLine();

            System.out.print("体重：");
            double weight = scanner.nextDouble();
            scanner.nextLine();
            System.out.println();

            array[i] = new Student(name, height, weight );
        }

        for (Student i : array){
            i.printInfo();
        }
    }
}
