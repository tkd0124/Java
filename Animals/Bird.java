package Animals;

public class Bird implements Flyable{
    public static final String NAME = "Bird";

    public Bird(String NAME){

    }

    @Override
    public void fly(){
        System.out.println(NAME + " is fly!!!");
    }
    @Override
    public void land(){
        System.out.println(NAME + " is landed !!!!!!!!!!!!!!");
    }
}
