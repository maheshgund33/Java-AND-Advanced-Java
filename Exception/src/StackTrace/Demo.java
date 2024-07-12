package StackTrace;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int x= sc.nextInt();
		
		try {
			if(x==0) {
				System.out.println("Throw Arthmatic exception");
			}
			System.out.println(10/x);
		}catch(ArithmeticException ae) {
			System.out.println("Exception thread"+ Thread.currentThread().getName());
			ae.printStackTrace();
			System.out.println(ae);
			
			System.out.println(ae.toString());
			System.out.println(ae.getMessage());
		}
	}

}
