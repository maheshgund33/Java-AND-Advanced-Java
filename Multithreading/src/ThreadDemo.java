
public class ThreadDemo {
	public static void main(String[] args) {
	     MyThread obj = new MyThread();
	    obj.start();
	    for(int i=0;i<10;i++) {
	    	System.out.println(" In main");
	    }
	}

}


// output error 
// bcoz not handle exception 