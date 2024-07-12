import java.util.Scanner;

public class ScannerPro {
	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		
		System.out.println("Enter the Dream Company ");
		
		String str=input.next();  // for string input 
		int num=input.nextInt();  // for int value 
		float value= input.nextFloat();
		String str2=input.nextLine();   // full line print karaychi asel tar 
		
		
		System.out.println(" My Dream company is "+ str);
		System.out.println(" My salary is "+ num);
		
	}

}
