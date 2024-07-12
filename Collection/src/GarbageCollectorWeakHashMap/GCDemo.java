package GarbageCollectorWeakHashMap;
import java.util.*;
public class GCDemo {
	public static void main(String[] args) {
		
		Demo obj1= new Demo("Mahesh");
		Demo obj2= new Demo("Gund");
		Demo obj3= new Demo("Mayur");
		
		WeakHashMap hm = new WeakHashMap();
		
		hm.put(obj1, 2021);
		hm.put(obj2, 2022);
		hm.put(obj3,2023);
		
		obj1= null;
		System.gc();
		System.out.println(hm);
		
	}

}

//output
//Notify
//{Mayur=2023, Gund=2022}