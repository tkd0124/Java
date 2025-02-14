package ShopList;

public class PolymorphismMain{
    public static void main(String[] args) {
        Item[] itemList = new Item[]{

                new Item("apple", 230),
                new Item("orenge", 180),
                new Item("banana", 120),

                new Book("what ?? aho", 590, "ahoman", 111),
                new Book("Woo! tensai", 320, "tensai", 777),

                new Clothes("Tシャツ", 2000, Clothes.TYPE_SHIRT, Clothes.SIZE_MEDIUM),
                new Clothes("ジーンズ", 3000, Clothes.TYPE_PANTS, Clothes.SIZE_LARGE),
                new Clothes("ダウンジャケット", 3000, Clothes.TYPE_PANTS, Clothes.SIZE_LARGE),
        };

        System.out.println("一覧");
        for (Item item : itemList){
            item.showInfo();
            System.out.println();
        }

        System.out.println("サイズの確認");
//        ( (Clothes) itemList[5] ).sizeCheck();
//        itemList[5].sizeCheck();
//
        if (itemList[5] instanceof Clothes){

            ( (Clothes) itemList[5] ).sizeCheck();
        }

    }
}
