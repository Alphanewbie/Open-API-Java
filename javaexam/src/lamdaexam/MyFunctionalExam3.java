package lamdaexam;

public class MyFunctionalExam3 { 
	public static void main(String[] args) {
		MyFunctionalInterface3 fi;
		
		fi = (x, y) -> {
			int result = x + y;
			return result;
		}; //오버라이딩 해야되는 함수를 보고 매개변수 갯수, 타입을 고려해서 넣는다.
		System.out.println(fi.method3(2, 5));
		
		fi = (x, y) ->  {return x + y; };
		System.out.println(fi.method3(2, 5));
		
		fi = (x, y) -> x + y;
		System.out.println(fi.method3(2, 5));
		
		fi = (x, y) -> sum(x, y);
		System.out.println(fi.method3(2, 5));
	}
	
	public static int sum(int x, int y) {
		return x + y;
	}
}











