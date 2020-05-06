package lamdaexam;

public class MyFunctionalExam1 { 
	public static void main(String[] args) {
		MyFunctionalInterface1 fi;
	
		// 리턴 값이 없는 게 마지막으로 return은 void
		MyFunctionalInterface1.pr();
		fi= () -> { 
			String str = "method call1";
			System.out.println(str);
		};
		fi.method1();
		
	
		fi = new MyFunctionalInterface1 () {
			public void method1() {
				System.out.println("method call2"); 
			}
		};		
		fi.method1();		
	}
}











