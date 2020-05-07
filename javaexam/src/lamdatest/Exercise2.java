package lamdatest;

@FunctionalInterface // �븿�닔�삎 �씤�꽣�럹�씠�뒪 泥댄겕 �뼱�끂�뀒�씠�뀡
interface MyNumber {
	int getMax(int num1, int num2);
}

public class Exercise2 {
	public static void main(String[] args) {
		MyNumber max;
		max = (int x, int y) -> (x >= y) ? x : y;
		
		
//		MyNumber max = new MyNumber() {
//			public int getMax(int x, int y) {
//				return (x >= y) ? x : y;
//			}
//		};
		System.out.println(max.getMax(100, 300));
	}
}
