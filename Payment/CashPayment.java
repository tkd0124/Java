package Payment;

import java.util.Scanner;

public class CashPayment extends Payment{

    public static final String CASH = "現金";

    public CashPayment(int paymentPrice) {
        super(CASH, paymentPrice);
    }

    @Override
    public void pay(){

        Scanner scanner = new Scanner(System.in);

        super.startPayment();
        super.pay();

        int paymentPrice = super.getPaymentPrice();
        int input = 0;

        do{
            System.out.println(paymentPrice + "円を入れます。");
            System.out.println("現在の金額" + input + "円を入れます。");
            System.out.print(">");
            input += scanner.nextInt();
            System.out.println();
        }while (paymentPrice > input);

        System.out.println("現在の金額" + input + "円");
        System.out.println();
        System.out.println("おつりは" + (input - paymentPrice) + "です。");
        System.out.println();

        super.endPayment();
    }
}
