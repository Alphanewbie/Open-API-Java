package lamdatest;

interface Calculation {
	public int add(int a, int b);
}

public class Exercise1 {
	public static void exec(Calculation com) {
		int k = 10;
		int m = 20;
		int value = com.add(k, m);
		System.out.println("계산결과 : " + value);
	}

	public static void main(String[] args) {
		Calculation cal= null;
		
		exec(cal = (int a,int b) -> a+b );
		
//		exec(new Calculation () {
//			public int add(int a, int b) {
//					return a + b;
//			   }
//		});
	}
}
