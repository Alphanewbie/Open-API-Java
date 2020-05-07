package lamdaexam;

public class UsingLocalVariable {
	void test_method(int arg) {  
		int localVar = 40; 	
		
		// 밑에 람사식에서 사용하기 때문에 자동적으로 final이 붙어서 수정할 수 없다.
//		arg = 31;  		
//		localVar = 41; 
		
		
		System.out.println(arg + ":" + localVar);
        
		//람다식
		MyFunctionalInterface5 fi= () -> {
			//로컬변수 사용
			// 이것도 익명 지역 이너함수 이기 때문에 자동적으로 위에 에러난다.
			System.out.println("arg: " + arg); 
			System.out.println("localVar: " + localVar + "\n");
		};
		fi.method5();
	}
}

