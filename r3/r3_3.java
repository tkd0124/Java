public class r3_3 {
    public static void main(String[] args) {
        System.out.println("運勢をうらないます");
        int fortune = new java.util.Random().nextInt(4) + 1;
        if (fortune == 1) {
            System.out.println("大吉");
            
        } else if (fortune == 2) {
            System.out.println("中吉");
            
        } else if (fortune == 3) {
            System.out.println("小吉");
        } else {
            System.out.println("凶");
        }
    }
    
}
