package Vector;
import java.util.Vector;
public class VectorDemo {
	public static void main(String [] args) {
		Vector v= new Vector();
		
		v.addElement(10);
		v.addElement(20);
		v.addElement(30);
		v.addElement(40);
		
		System.out.println("All Element of v is:"+ v);
		
		System.out.println("Capacity od vector :-"+ v.capacity());
		
		
	}

}
//output
//All Element of v is:[10, 20, 30, 40]
//Capacity od vector :-10