
public class Palidrome {
	public static void main(String[] args) {
		int x=2332;
		int rev=0;
		int temp=x;
		
		while(x>0) {
			
			int rem=x%10;
			rev= rev*10 +rem;
			
			x=x/10;
			
			
		}
		if(temp==x) {
		 System.out.println("yes");
		}
		else 
			System.out.println("No");
	
	}

}
