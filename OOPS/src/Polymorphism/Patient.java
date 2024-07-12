package Polymorphism;

public class Patient {
	
	// overloading 
	
	void getBed() {
		System.out.println("Normal Bed");
	}
	
	void getBed(String name) {
		
		System.out.println(str);
	}
	static String str= " ICU BED";
	
	public static void main(String[] args) {
		Patient b= new Patient();
		b.getBed();
		b.getBed(str);
	}
}



//Output
//Normal Bed
//ICU BED
