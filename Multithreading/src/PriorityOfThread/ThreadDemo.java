package PriorityOfThread;

public class ThreadDemo {
	public static void main(String[] args) {
		
		Thread obj= Thread.currentThread();
		System.out.println(obj.getPriority());
		
		MyThread obj1= new MyThread();
		obj1.start();
		
		obj.setPriority(7);
		
		MyThread obj2= new MyThread();
		obj2.start();
		
		
		
	}

}

//thread multiple use karshil tevha
