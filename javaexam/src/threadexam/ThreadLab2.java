package threadexam;

import java.util.Date;

//public class ThreadLab2 {
//	public static void main(String args[]) {
//		Thread t2 = new Thread(new TreadTest2());
//		t2.start();
//		System.out.println(t2.isDaemon());
//	}
//
//}
//
//class TreadTest2 implements Runnable {
//	public void run() {
//
//		Date today = null;
//
//		for (int i = 0; i < 5; i++) {
//			today = new Date();
//			System.out.println(today.getTime());
//			try {
//				Thread.sleep(5000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//
//	}
//}


public class ThreadLab2 implements Runnable{
	public static void main(String args[]) {
		Thread t2 = new Thread(new ThreadLab2());
		t2.setDaemon(true);
		t2.start();
		for(int i=0;i<5;i++) {
			System.out.println("돌아가는 중?");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	@Override
	public void run() {

		Date today = null;

		while(true) {
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

}
