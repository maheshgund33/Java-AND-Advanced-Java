import  java.io.*;
public class Assignment6 {
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(" Enter the Array size");
		
		int size= Integer.parseInt(br.readLine());
		
		int arr[]= new int[size];
		
		System.out.println(" Enther the string element");
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=Integer.parseInt(br.readLine());
			
		}
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(max < arr[i]) {
				max=arr[i];
			}
			
		}
		System.out.println("Maximun element is :"+ max);
		
		
		
	}

}
