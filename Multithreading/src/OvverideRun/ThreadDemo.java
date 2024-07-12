package OvverideRun;

public class ThreadDemo {
	public static void main(String[] args) {
		MyThread obj = new MyThread();
		obj.start();
		System.out.println(Thread.currentThread().getName());
	}

}


//op 
//In My Thread start
//In run
//main
//main
