package kadai10;
import kadai10.thread.*;

public class Kadai10_3 {
	public static void main(String[] args) {

		Thread fiveSecThread = new FiveSecThread();
		Thread threeSecThread = new ThreeSecThread();

		fiveSecThread.start();
		threeSecThread.start();

		for (int i = 1; i <= 15; i++) {

			try {
				Thread.sleep(1000);
				System.out.println("MainThread     = " + i + "秒");

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
