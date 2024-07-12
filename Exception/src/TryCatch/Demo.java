package TryCatch;

public class Demo {
	
	public static void main(String[] args) {
		
		try{
			int x=10;
			System.out.println(x/0);
			
		}catch(ArithmeticException obj ) {
			System.out.println("print the catch");
		}
	}

}

//output
//print the catch