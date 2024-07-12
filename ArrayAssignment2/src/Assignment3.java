 import java.io.*;
public class Assignment3 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the size Element ");
		
		int size = Integer.parseInt(br.readLine());
		
		System.out.println("Enter the elemnt: ");
		int arr[] = new int[size];
		int even=0;
		int odd=0;
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=Integer.parseInt(br.readLine());
		    
			if(arr[i]%2==0) {
				even+=arr[i];
			}else {
				odd+=arr[i];
			}
		}
		System.out.println("Sum of the even element "+ even);
		System.out.println("Sum of the odd element "+ odd);
		
	}

}
