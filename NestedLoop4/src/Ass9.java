
public class Ass9 {
	public static void main(String[] args) {
		int num=1;
		
		
		for(int i=0;i<4;i++) {
			for(int j=0;j<=i;j++) {
				
				if((i+j)%2==0 ) {
					int num1=3;
					System.out.print(num1*num1+ " ");
					
				} else {
					System.out.print(num*num*num+ " ");
					
				}
				num++;
			}
			System.out.println();
		}
		
	}

}
