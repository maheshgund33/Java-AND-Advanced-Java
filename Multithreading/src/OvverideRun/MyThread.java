package OvverideRun;

public class MyThread extends Thread {
	public void  run() {
		System.out.println("In run");
		System.out.println(Thread.currentThread().getName());
	}
	public  void start() {
		System.out.println("In My Thread start");
		run();
	}
}
