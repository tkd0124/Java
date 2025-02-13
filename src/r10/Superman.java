package src.r10;

public class Superman extends Heromo{
    boolean flying;

    public void fly(){
        this.flying = true;
        System.out.println("Superman fly!!!!");
    }

    public void land(){
        this.flying = false;
        System.out.println("Land !!!");
    }

//    @Override
    public void run() {
        System.out.println(this.name + " run&run!!!!");
    }
}
