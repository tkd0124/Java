package ShopList;

public class Payment {
    private String paymentName;
    private int paymentPrice;

    public Payment(String paymentName, int paymentPrice) {
        this.paymentName = paymentName;
        this.paymentPrice = paymentPrice;
    }

    public String getPaymentName() {
        return paymentName;
    }

    public int getPaymentPrice() {
        return paymentPrice;
    }

    public void setPaymentName(String paymentName) {
        this.paymentName = paymentName;
    }

    public void setPaymentPrice(int paymentPrice) {
        this.paymentPrice = paymentPrice;
    }

    public void startPayment(){
        System.out.println(this.paymentName + "の支払い処理を始めます");
    }

    public void pay(){
        System.out.println("支払い方法 : " + paymentName);
        System.out.println("支払い金額 : " + paymentPrice + "円");
        System.out.println();
    }
    public void endPayment(){
        System.out.println("支払い処理が完了しました");
        System.out.println("購入ありがとうございました");
    }
}
