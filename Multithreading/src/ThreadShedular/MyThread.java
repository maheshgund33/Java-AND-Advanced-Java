package ThreadShedular;

public class MyThread  extends Thread{
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
		
		for(int i=0;i<10;i++) {
		System.out.println("In Run");
		
		try {
			Thread.sleep(1000);
		  }
		catch(InterruptedException obj) {
			
		}
		}
	}
}
