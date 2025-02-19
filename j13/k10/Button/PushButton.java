package k10.Button;

public class PushButton implements Button{

    public PushButton(){
        super();
    }

    @Override
    public void onClick() {
        System.out.println("プッシュ" + Button.BUTTON_PUSHED);
        System.out.println("プッシュ" + Button.BUTTON_RELEASED);
    }
}
