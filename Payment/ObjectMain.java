package Payment;

public class ObjectMain {
    public static void main(String[] args) {
        Object obj = new CashPayment(1000);

        String str = obj.toString();

        System.out.println(str);

        System.out.println(obj);

        System.out.println();

        Object obj2 = new CashPayment(10000);

        System.out.println(obj.equals(obj2));
    }
}
