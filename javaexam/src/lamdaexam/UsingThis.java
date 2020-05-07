package lamdaexam;

public class UsingThis {
	public int outterField = 10;

	class Inner {
		int innerField = 20;

		void test_method() {
			MyFunctionalInterface4 fi= () -> {
				System.out.println("outterField: " + outterField);
				// 아우터 클래스에 대한 객체를 사용하는 방법.
				// 즉 inner클래스를 포함하고 있는 바깥의 객체인 UsingThis의 객체를 사용한다.
				System.out.println("outterField: " + UsingThis.this.outterField + "\n");
				
				System.out.println("innerField: " + innerField);
				System.out.println("innerField: " + this.innerField + "\n");
			};
			fi.method4();
		}
	}
}

