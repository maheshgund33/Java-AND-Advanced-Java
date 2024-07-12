package PriorityOfThread;

public class MyThread extends Thread{
	public void run() {
		System.out.println(Thread.currentThread().getName());
		System.out.println(obj.getpriority());
	}

}
