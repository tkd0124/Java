package ShopList;

public class Book extends Item{

    private String author ;
    private int isbn;

    public Book(String name, int price,String author, int isbn){
        super(name, price);
        this.author = author;
        this.isbn = isbn;
    }
    public String getAuthor() {
        return author;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    @Override
    public void showInfo(){
        super.showInfo();
        System.out.println("著者 : " + this.author);
        System.out.println("ISBN : " + this.isbn);
    }
}
