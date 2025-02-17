package Animals;

public class Dog extends Animal{
    public static final String NAME = "Dog";

    public Dog() {
        super(NAME);
    }

    @Override
    public void eat(){
        System.out.println(super.getName() + " is eating a bone.");
    }
    @Override
    public void sleep(){
        System.out.println(super.getName() + " sleep on the floor");
    }
}
