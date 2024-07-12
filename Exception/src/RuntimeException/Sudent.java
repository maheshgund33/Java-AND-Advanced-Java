package RuntimeException;
import java.util.*;
public class Sudent {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int amount= sc.nextInt();
		try{
			if(amount!=10000) 
			   throw new Exception("Plsease Enter valid ammount ");
	            
			catch(AdmisssionAmountException obj) {
				System.out.println("Amount Should be 10000");
			}
		}	
		
	}

}
