
import java .io.*;
public class Asignment2 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the Size of array ");
		int size= Integer.parseInt(br.readLine());
		
		System.out.println("Enter the elemnt od array  ");
		int arr[] = new int[size];
		
		int even=0;
		int odd=0;
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=Integer.parseInt(br.readLine());
			
			if(arr[i]%2==0)	{
				even++;
			}else {
			
				odd++;
			}
			}
		System.out.println("number of even elemnt "+   even);
		System.out.println("number of odd elemnt "+   odd);
		
		
	}

}
