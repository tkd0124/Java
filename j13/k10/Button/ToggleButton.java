package k10.Button;

public class ToggleButton implements Button {

    private boolean pressed = false;

    @Override
    public void onClick() {
        if (!pressed) {
            System.out.println("トグル" + Button.BUTTON_PUSHED);
            this.pressed = true;
        }else {
            System.out.println("トグル" + Button.BUTTON_RELEASED);
            this.pressed = false;
        }
    }
}
