package Animals;

public class Crow extends Animal implements Flyable{
    public static final String NAME = "Crow";

    public Crow(){
        super(NAME);
    }
    @Override
    public void eat(){
        System.out.println(super.getName() + "is eating a gabage.");
    }
    @Override
    public void sleep(){
        System.out.println(super.getName() + "sleep on the brunch");
    }

    @Override
    public void fly(){
        System.out.println(super.getName() + Flyable.FLY_MSG);
    }
    @Override
    public void land(){
        System.out.println(super.getName() + Flyable.LAND_MSG);
    }
}
