import java.util.Scanner;

public class C3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        boolean answer = isPrime(N);
        if (answer == true) {
                System.out.println("prime");
        }
        else {
            System.out.println("not prime");
        }
    }
    static boolean isPrime(long N) {
        for (long i = 2; i <= N - 1; i++) {
            if (N % i == 0) {
                return false;
            }
        }
        return true;
    }
}
