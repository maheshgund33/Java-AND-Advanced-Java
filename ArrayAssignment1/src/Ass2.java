import java .io.*;
public class Ass2 {
	public static void main(String args[])throws IOException{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Array Size: ");
		int size=Integer.parseInt(br.readLine());
		
		int arr[]=new int[size];
		int product=1;
		System.out.println("Enter Array Elements: ");
		
		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
			if(arr[i] % 2 ==0){

				product =product*arr[i];
			}
		}

		System.out.println("product of even Number is "+product);
	}


}
