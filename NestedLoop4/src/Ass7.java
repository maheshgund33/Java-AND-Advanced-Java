
public class Ass7 {
	public static void  main(String[] args) {
		char ch1='F';
		int num=1;
		for(int i=1;i<=6;i++) {
			char ch = ch1;
			
			for(int j=1;j<=i;j++) {
				
				if(j%2==0 ) {
					System.out.print(num+" ");
					num++;
				  }else {
					System.out.print(ch+ " ");
					ch--;
				}
			}
			System.out.println();
			ch1--;
		}
	}

}
