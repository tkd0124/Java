package src;

public class Product {
    String name;
    int price;
    int num;

    public Product(){
        this.name = "No name";
        this.price = 0;
        this.num = 0;
    }

    public Product(String name, int price, int num){
        name = this.name;
        price = this.price;
        num = this.num;
    }

    public static void countInfo(Product[] products){
        System.out.println("商品の種類：" + products.length + "種類");
    }

    public void productInfo(){
        System.out.println("商品名：" + this.name);
        System.out.println("    価格：" + this.price + "円");
        System.out.println("    在庫：" + this.num + "個");
        System.out.println();
    }
}
