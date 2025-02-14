package ShopList;

public class Clothes extends Item{
    private String type;
    private String size;

    public static final String SIZE_SMALL = "S";
    public static final String SIZE_MEDIUM = "M";
    public static final String SIZE_LARGE = "L";
    public static final String SIZE_XLARGE = "XL";

    public static final String TYPE_SHIRT = "シャツ";
    public static final String TYPE_PANTS = "パンツ";
    public static final String TYPE_OUTER = "アウター";

    public Clothes(String name, int price, String type, String size) {
        super(name, price);
        this.type = type;
        this.size = size;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public String getSize() {
        return size;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("種類 : " + this.type);
        System.out.println("サイズ : " + this.size);
    }

    public void sizeCheck(){
        System.out.println(super.getName() + "のサイズは" + this.size + "です。");
    }
}
