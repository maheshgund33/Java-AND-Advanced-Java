
public class SquareofEvenDigit {
  public static void main(String[] args) {
	  int num=123456;
	  
	  while(num>0) {
		  int rem=num%10;
		  if(rem%2 ==0) {
			  System.out.println(rem * rem);
		  }
		  num =num/10;
	  }
	  
  }
}  
