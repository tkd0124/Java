package Payment;

import java.util.Scanner;

public class ElectronicMoneyPayment extends Payment{

    Scanner scanner = new Scanner(System.in);

    public static final String ELECTRONIC_MONEY = "電子マネー";

    public ElectronicMoneyPayment(int paymentPrice) {
        super(ELECTRONIC_MONEY, paymentPrice);
    }

    @Override
    public void pay(){

        super.startPayment();
        super.pay();

        int input = 0;
        do {
            System.out.println("電子マネーをタッチしてください：0");
            System.out.print(">");

            input = scanner.nextInt();
            System.out.println();

            if (input == 0 ){
                System.out.println("支払い金額：" + super.getPaymentPrice() + "円");
                System.out.println("支払い処理終了");
                System.out.println();
                break;
            }
        }while (true);

        super.endPayment();
    }
}
