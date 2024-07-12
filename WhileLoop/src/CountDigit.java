
public class CountDigit {
  
	public static void main(String[] args) {
		int x=942111423;
		int count=0;
		while(x!=0) {
			count++;
			x=x/10;
		}
		System.out.println(count);
		
	}
}
