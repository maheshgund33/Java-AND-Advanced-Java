import java .io.*;
public class Assignment4 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println(" Enter the letter ");
		int size= Integer.parseInt(br.readLine());
		

		char arr[]= new char[size];
		System.out.println("Enter the Element");
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=(char)br.read();
			br.skip(i);
		}
		System.out.println("vowel char");
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==97 || arr[i]==101 || arr[i]==105 || arr[i]==109 || arr[i]==111 || arr[i]==117) {
				System.out.println(arr[i]);
			}
			
		}
		
		
		
	}

}
