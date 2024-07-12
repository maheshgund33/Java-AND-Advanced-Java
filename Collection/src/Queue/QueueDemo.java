package Queue;
import java.util.*;
public class QueueDemo {
	public static void main(String[] args) {
		Queue que= new LinkedList();
		
		que.offer(10);
		que.offer(20);
		que.offer(30);
		que.offer(40);
		
		System.out.println(que);
		
		que.poll();  // remove first
		que.remove();
		
		System.out.println(que);
		System.out.println(que.peek()); // no excption 
		System.out.println(que.element()); // exception 
		
		System.out.println(que);
	}
	

}


//output
//[10, 20, 30, 40]
//[30, 40]
//30
//30
//[30, 40]