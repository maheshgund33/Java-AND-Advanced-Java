
public class CountOdd {
	public static void main(String[] args) {
		int x=123456;
		int count = 0;
		
		while(x!=0) {
			int rem = x%10;
			if((x%2)!=0) 
               count++;
            x=x/10;
			
		    }
			System.out.println(count);
	
	}

}
