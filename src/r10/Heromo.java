package src.r10;

public class Heromo {
    String name = "naruto";
    int hp = 100;

    public void attack(Matangomo m) {
        System.out.println(this.name + "の攻撃！");
        m.hp -= 5;
        System.out.println("5ポイントのダメージをあたえた！");
    }

    public final void slip(){
        this.hp -= 5;
        System.out.println(this.name + " slip!!(笑)");
        System.out.println("Dammm -5");
    }

    // 逃げる
    public void run() {
        System.out.println(this.name + "は逃げ出した！");
    }
}
