package innerexam;
class LocalTest {
   String name = "Java";
   void pr(String s) {
      int su = 100;      
      System.out.println(s + " : " + su);
      class Local {
         void pr(String ls) {
            System.out.println("s : " + s);   	// Main Call
            System.out.println("ls : " + ls);   	// Local Call      
            System.out.println(name);        	// Java
            System.out.println(su);				// 100
            // su++;
            // 지역 변수로 선언되어 있는 값은 자동으로 final로 선언되어서 바꿀 수가 없다.
            name = "python";
            // 인스턴스로 선언되어 있는건 바꿀수 있다.
         }
      }          
      Local lt = new Local();
      lt.pr("Local Call");
   }
}   
public class InnerTest2 {
   public static void main(String args[]) {
      LocalTest l = new LocalTest();
      l.pr("Main Call");
   }
}





