package r3;
public class r3_5 {
    public static void main(String[] args) {
        System.out.println("あなたの運勢を占います");
        int fortune = new java.util.Random().nextInt(5) + 1;
        switch (fortune) {
            case 1, 2:
                System.out.println("いいね！");
                break;
            case 3:
                System.out.println("普通です");
                break;
            //case 4, 5:
                //System.out.println("うーん・・・");
                //break;

        
            default:
                System.out.println("うーん・・・");
                break;
        }
    }
}
