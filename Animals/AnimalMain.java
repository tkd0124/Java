package Animals;

import java.awt.geom.FlatteningPathIterator;

public class AnimalMain {
    public static void main(String[] args) {
        Animal[] animal = {
                new Dog(),
                new Crow()
        };
        System.out.println();

        for (Animal a : animal){
            a.eat();
            a.sleep();

            if (a instanceof Flyable){
                Flyable fa = (Flyable) a;
                fa.fly();
                fa.land();
            }
            System.out.println();
        }

        Bird b = new Bird(Bird.NAME);
        b.fly();
        b.land();
    }
}
