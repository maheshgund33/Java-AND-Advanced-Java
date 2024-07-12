
public class SumAndMultilication {
	public static void main(String[] args) {
   
      int x=123456;
      int sum=0;
      int multi=1;
	   
      while(x!=0) {
    	  int rem= x%10;
    	  if(rem%2 !=0) 
    		  sum= sum+rem;
    		  
    	  else 
    		  multi=multi*rem;
    		  x=x/10;
    		  
           }
    	  System.out.println(sum);
    	  System.out.println(multi);
      
	   
   }
}
