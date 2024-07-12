package NullPointer;

public class Demo {
	void m1() {
		System.out.println("In M1");
	}
	
	void m2() {
		System.out.println("In m2");
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("Start main");
		Demo ob= new Demo();
		
		ob.m1();
		
		ob= null;
		ob.m2();
		System.out.println("End main");
		
	 }

}

//ouyput
//Exception in thread "main" Start main
//In M1
//java.lang.NullPointerException
//	at NullPointer.Demo.main(Demo.java:21)
