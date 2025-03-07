package src.r11;
public class Hero {
    private int hp;
    private String name;
    private Sword sword;

    public String getName(){
        return this.name;
    }

    public void setName(String name) {
        if (name == null){
            throw new IllegalArgumentException("名前がnullである");
        }
        if (name.length() <= 1){
            throw  new IllegalArgumentException("名前が短い");
        }
        if (name.length() >= 8){
            throw new IllegalArgumentException("Long!!");
        }
        this.name = name;
    }

    public void bye(){
        System.out.println("勇者は別れを告げた");
    }
    private void die(){
        System.out.println(this.name + "is die...");
        System.out.println("GAME OVER");
    }
    void sleep() {
        this.hp = 100;
        System.out.println(this.name + "は眠って回復した！");
    }
    public void attack(Matango m) {
        System.out.println(this.name + "の攻撃！");
        /* … */
        System.out.println("お化けキノコ" + m.suffix + "から2ポイントの反撃を受けた");
        this.hp -= 2;
        if (this.hp <= 0 ) {
            this.die();
        }
    }
}
//
//public class Hero extends Character {
//    public void attack(Monster m) {
//        System.out.println(this.name + "の攻撃！");
//        System.out.println("敵に10ポイントのダメージをあたえた！");
//        m.hp -= 10;
//    }
//}
//
////public class Hero extends Character {
////    public void attack(Matango m) {
////        System.out.println(this.name + "の攻撃！");
////        System.out.println("敵に10ポイントのダメージをあたえた！");
////        m.hp -= 10;
////    }
////}
