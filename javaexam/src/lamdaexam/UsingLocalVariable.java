package lamdaexam;

public class UsingLocalVariable {
	void test_method(int arg) {  
		int localVar = 40; 	
		
		// �ؿ� ����Ŀ��� ����ϱ� ������ �ڵ������� final�� �پ ������ �� ����.
//		arg = 31;  		
//		localVar = 41; 
		
		
		System.out.println(arg + ":" + localVar);
        
		//���ٽ�
		MyFunctionalInterface5 fi= () -> {
			//���ú��� ���
			// �̰͵� �͸� ���� �̳��Լ� �̱� ������ �ڵ������� ���� ��������.
			System.out.println("arg: " + arg); 
			System.out.println("localVar: " + localVar + "\n");
		};
		fi.method5();
	}
}

