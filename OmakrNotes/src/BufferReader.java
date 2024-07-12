import java.io.*;
public class BufferReader {
	public static void main(String[] args)throws Exception {
		InputStreamReader isb= new InputStreamReader(System.in);
		
		BufferReader br= new BufferReader(isb);
		System.out.println("Name");
		
		String name=br.readline();
		System.out.println(name);
		
		int age = Integer.ParseInt(br.readLine());
		System.out.println(age);
		
		
		
	}

}
