package Payment;

import java.util.Scanner;

public class CreditCardPayment extends Payment{
    public static final String CREDIT_CARD = "クレジットカード";

    public CreditCardPayment(int paymentPrice){
        super(CREDIT_CARD, paymentPrice);
    }

    @Override
    public void pay(){
        Scanner scanner =new Scanner(System.in);

        super.startPayment();
        super.pay();

        int input = 0;

        do {
            System.out.println("クレジットカードを挿入してください：o");
            System.out.print(">");
            input = scanner.nextInt();
            System.out.println();

            if (input == 0){
                System.out.println("認証中・・・");
                System.out.println("認証完了");
                System.out.println("支払い金額：" + super.getPaymentPrice() + "円");
                System.out.println("完了");
                break;
            }
        }while (true);

        super.endPayment();
    }
}
