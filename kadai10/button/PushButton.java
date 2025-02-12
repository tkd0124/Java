package kadai10.button;

public class PushButton implements Button {

	@Override
	public void onClick() {
		System.out.println("プッシュ" + BUTTON_PUSHED);
		System.out.println("プッシュ" + BUTTON_RELEASED);
	}
}
