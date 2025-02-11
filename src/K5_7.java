package src;

public class K5_7 {
    public static void main(String[] args) {
        Product[] products = new Product[]{
                new Product("りんご", 100, 10),
                new Product("みかん", 50, 5),
                new Product("バナナ", 80, 3)
        };

        Product.countInfo(products);
        for(Product i : products){
            i.productInfo();
        }
//        products[0].buy(10);
//        System.out.println();
//
//        for (Prodouct i : products){
//            i.productInfo();
//        }
//        products[2].buy(5);
//        System.out.println();
    }
}
