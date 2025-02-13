package src.r11;

public class Main {
    public static void main(String[] args) {
        Hero hero = new Hero();
        King king = new King();
        hero.setName("pok");
        king.talk(hero);

//        Monster[] monsters = new Monster[3];
//        monsters[0] = new Slime();
//        monsters[1] = new Goblin();
//        monsters[2] = new DeathBat();
//        for (Monster m : monsters) {
//            m.run();
//        }
    }
//    public static void main(String[] args) {
//        Character[] c = new Character[5];
//        c[0] = new Hero();
//        c[1] = new Hero();
//        c[2] = new Thief();
//        c[3] = new Wizard();
//        c[4] = new Wizard();
//        // 宿屋に泊まる
//        for (Character ch : c) {
//            ch.hp += 50;
//        }
//        Slime s = new Slime(); Monster m = new Slime();
//        s.run(); m.run();
//        Wizard w = new Wizard();
//        Character c = w;
//        Matango m = new Matango();
//        c.name = "アサカ";
//        c.attack(m);
//        c.fireball(m);
//    }
//    public static void main(String[] args) {
//        Wizard w = new Wizard();
//        Matango m = new Matango();
//        w.name = "アサカ";
//        w.attack(m);
//        w.fireball(m);
}
