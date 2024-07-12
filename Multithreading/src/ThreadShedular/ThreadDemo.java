package ThreadShedular;

public class ThreadDemo {
	public static void main(String[] args) throws InterruptedException {
		MyThread obj = new MyThread();
		obj.start();
		
		System.out.println(Thread.currentThread().getName());
		
		for(int i=0; i<10;i++) {
			System.out.println("In  Main");
			Thread.sleep(1000);
		}
		
	}

}


// output 
// inpredicatble output yenr 
//main
//In  Main
//Thread-0
//In Run
//In Run
//In  Main
//In Run
//In  Main
//In  Main
//In Run
//In Run
//In  Main
//In Run
//In  Main
//In  Main
//In Run
//In  Main
//In Run
//In  Main
//In Run
//In  Main
//In Run
//// output unpredicable 