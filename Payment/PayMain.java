package Payment;

import java.util.Scanner;

public class PayMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("支払い方法を選んでください");
        System.out.println("1:現金 2:クレジットカード 3:電子マネー");
        System.out.print(">");
        int input = scanner.nextInt();
        System.out.println();

        System.out.println("支払い金額を入力してください");
        System.out.print(">");
        int paymentPrice = scanner.nextInt();
        System.out.println();

        Payment payment = switch (input){
            case 1 -> new CashPayment(paymentPrice);
            case 2 -> new CreditCardPayment(paymentPrice);
            case 3 -> new ElectronicMoneyPayment(paymentPrice);
            default -> null;
        };

        if (payment != null){
            payment.pay();
        }
    }
}
