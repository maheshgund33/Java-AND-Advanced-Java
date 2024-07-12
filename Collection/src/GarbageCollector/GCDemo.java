package GarbageCollector;

public class GCDemo {
	public static void main(String[] args ) {
		Demo obj1= new Demo("Core2Web");
		Demo obj2 = new Demo("Baner");
		Demo obj3= new Demo(" Mahesh");
		
		
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
		
		obj1=null;
		obj2= null;
		
		System.gc();
		System.out.println("In Main");
	}

}

//output 
//
//Core2Web
//Baner
// Mahesh
//In Main
//Notify
//Notify
