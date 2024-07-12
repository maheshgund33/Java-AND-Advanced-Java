import java.util.Scanner;
public class ReverseFromNUmner {
    public static void main(String[] args) {
    	
    	Scanner input = new Scanner(System.in);
    	int num=input.nextInt();
    
    	if(num%2 ==0)
    		while(num>0) {
    			System.out.println(num);
    			num--;
    
    		
    		}
    	else 
    		while(num>0) {
    			System.out.println(num);
    			num=num-2;
    		}
    	   
    	
    }
}
