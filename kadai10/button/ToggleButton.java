package kadai10.button;

public class ToggleButton implements Button{

	private boolean isPushed = false;

	@Override
	public void onClick(){

		if(!isPushed){
			this.isPushed = true;
			System.out.println("トグル" + BUTTON_PUSHED);
		}else{
			this.isPushed = false;
			System.out.println("トグル" +BUTTON_RELEASED);
		}

	};
}
