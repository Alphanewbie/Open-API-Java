package innerexam;
abstract class Test {
   Test() {
      System.out.println("No Argument sample");
   } 
   Test(String msg) {
	      System.out.println("Argument sample : "+ msg);
   } 
   abstract void output(String s);
}
public class InnerTest3 {
   void pr(Test o) {
      o.output("Test");     
   }
   public static void main(String args[]) {	   
      System.out.println("Main start !!");
      InnerTest3 n = new InnerTest3();
      n.pr(new Test("ㅋㅋㅋㅋ") {	// 여기서 한번만 사용할 수 있는 객체.
    	  	int su = 100;
    	  	public void output(String s) {
    	  		System.out.println("Anonymous Class : " + s);
    	  		System.out.println("Anonymous Class : " + su);            
    	  	}				
      });			
   }	
}


