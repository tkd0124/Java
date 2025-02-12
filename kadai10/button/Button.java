package kadai10.button;

public interface Button {

	String BUTTON_PUSHED = "ボタンが押されました。";
	String BUTTON_RELEASED = "ボタンが離されました。";

	void onClick();
}
