
package TryCatch;

public class Finally {
	void m1() {
		System.out.println("M1");
	}
	void m2() {
		System.out.println("M2");
	}
	
	public static void main(String[] args) {
		
		Finally obj = new Finally();
		obj.m1();
		obj= null;
		obj.m2();
		try {
			System.out.println("Print the try");
		}
		catch(ArithmeticException obj1) {
			System.out.println("Catch block ");		
			}
		finally{
			System.out.println("Filse closed by finally");
		}
		System.out.println("End the main ");
	}

}

//output
//M1
//Exception in thread "main" java.lang.NullPointerException
//	at TryCatch.Finally.main(Finally.java:17)