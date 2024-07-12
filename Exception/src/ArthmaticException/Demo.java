package ArthmaticException;

public class Demo {
		
		
		void m1() {
			System.out.println(10/0);
		}
		
		void m2() {
			System.out.println("IN m2");
		}
		

		public static void main(String[] args) {
			
			
			Demo ob= new Demo();
			ob.m1();
			
		}
}

//Execption 
//Exception in thread "main" java.lang.ArithmeticException: / by zero
//at ArthmaticException.Demo.m1(Demo.java:7)
//at ArthmaticException.Demo.main(Demo.java:19)
