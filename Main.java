public class Main {
    public static void main(String[] args) {
        Hero h = new Hero("ミナト");

        System.out.println(h.hp);
        System.out.println(h.name);
        Sword s = new Sword();
        s.name = "炎の剣";
        s.damage = 10;
//        Hero h1 = new Hero();
//        h1.name = "ミナト";
//        h1.hp = 100;
//        Hero h2 = new Hero();
//        h2.name = "アサカ";
//        h2.hp = 100;
//        Wizard w = new Wizard();
//        w.name = "スガワラ";
//        w.hp = 50;
//        w.heal(h1);    // ミナトを回復させる（HP: 100 -> 110）
//        w.heal(h2);    // アサカを回復させる（HP: 100 -> 110）
//        w.heal(h2);    // アサカを回復させる（HP: 110 -> 120）
//        h1.sword = s;
//        System.out.println("現在の武器は" + h1.sword.name);
//        Hero h1;
//        h1 = new Hero();
//        h1.hp = 100;
//        Hero h2;
//        h2 = h1;
//        h2.hp = 200;
//        System.out.println(h1.hp);
//         //　クラスHeroのインスタンスを生成
//        Hero h = new Hero();
//        // 2.フィールドに初期値をセット
//        h.name = "ミナト";
//        h.hp = 100;
//
//        Matango m1 = new Matango();
//        m1.hp = 50;
//        m1.suffix = 'A';
//
//        Matango m2 = new Matango();
//        m2.hp = 48;
//        m2.suffix = 'B';
//
//        h.sleep();
//        m1.run();
//        m2.run();
//        h.run();
    //        System.out.println("勇者" + h.name + "を生み出しました！");
//        // 3.勇者のメソッドを呼び出してゆく
//        h.sleep();
//        h.sit(5);
//        h.slip();
//        h.sit(25);
//        h.run();
    }
}
