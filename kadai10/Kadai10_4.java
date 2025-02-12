package kadai10;
import kadai10.thread.*;

public class Kadai10_4 {
	public static void main(String[] args) {

		Runnable fiveSecThread = new Runnable() {
			@Override
			public void run() {
				for(int i = 1; i <= 3; i++) {
					try {
						Thread.sleep(5000);
						System.out.println("FiveSecThread  = " + i * 5 + "秒");

					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};

		Runnable threeSecThread = new Runnable() {
			@Override
			public void run() {
				for(int i = 1; i <= 5; i++) {
					try {
						Thread.sleep(3000);
						System.out.println("ThreeSecThread = " + i * 3 + "秒");

					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};

		Thread thread1 = new Thread(fiveSecThread);
		Thread thread2 = new Thread(threeSecThread);

		thread1.start();
		thread2.start();

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