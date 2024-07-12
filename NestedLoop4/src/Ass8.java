
public class Ass8 {
	public static void main(String[] args) {
		int num =10;
		char ch= 'I';
		for(int i=1;i<=4;i++) {
			
			for(int j=1;j<=i;j++) {
				
				if(i%2!=0) {
					System.out.print(num+ " ");
					num-=3;
				 
				}
				else {
					
					System.out.print(ch+ " ");
					ch-=4;
				}
				
			}
			System.out.println();		}
	}

}
