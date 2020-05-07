package lamdaexam;

import java.util.Date;

public class LamdaThreadLab {
	public static void main(String args[]) {
		Runnable newrun;
		newrun = () -> {
			Date today = null;
			for (int i = 0; i < 5; i++) {
				today = new Date();
				System.out.println(today.getTime());
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		
		
		Thread t2 = new Thread(newrun);
		t2.start();
	}

}