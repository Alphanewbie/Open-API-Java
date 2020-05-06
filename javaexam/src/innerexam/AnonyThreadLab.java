package innerexam;

import java.util.Date;

public class AnonyThreadLab {
	public static void main(String args[]) {
		Thread t2 = new Thread(new Runnable(){
			Date today = null;
			public void run() {
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

			}
		});
		t2.start();
	}

}