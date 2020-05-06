package threadexam;

import java.util.Date;

public class ThreadLab1 {
	public static void main(String args[]) {
		TreadTest t1 = new TreadTest();
		t1.start();
	}

}

class TreadTest extends Thread {
	public void run() {

		Date today = new Date();

		for (int i = 0; i < 3; i++) {
			System.out.println(today.getTime());
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}