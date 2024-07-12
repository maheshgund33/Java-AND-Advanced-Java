package Stack;
import java.util.*;

public class StackDemo {
	public static void main(String[] args) {
		Stack s = new Stack();
		s.push(10);
		s.push(200);
		s.push(30);
		
		System.out.println(s);
		
	
	}

}
//output
//[10, 200, 30]
//		
//pop() > last element remove
//peek() >>return top object 
//empty() >
//search()>> return index(iterationorder)