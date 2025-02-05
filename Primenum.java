import java.util.Scanner;

public class Primenum {
    public static void main(String[] args) {
        System.out.println("指定の値までの素数を表示します。");
        System.out.println("正の整数を入力してください。");

        Scanner scanner = new Scanner(System.in);
        System.out.print("値：");
        int s = scanner.nextInt();
        boolean bool = true;

        for (int i = 2; i <= s; i++){
            for (int j = 1; j<i; j++){
                int primeNum = i % (i - j);
                if (primeNum == 0){
                    bool = false;
                    break;
                }
            }if (bool){
                System.out.println(i);
            }
        }
    }
}
