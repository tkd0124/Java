package ShopList;

public class ItemMain {
    public static void main(String[] args) {
        Item[] itemList = new Item[]{
                new Item("apple", 230),
                new Item("orenge", 180),
                new Item("banana", 120)
        };

        Book[] b = new Book[]{
                new Book("what ?? aho", 590, "ahoman", 111),
                new Book("Woo! tensai", 320, "tensai", 777)
        };

        System.out.println("一覧");
        for (Item i : itemList){
            i.showInfo();
            System.out.println();
        }

        System.out.println("書籍情報一覧");
        for (Book book: b){
            book.showInfo();
            System.out.println();
        }

    }
}
