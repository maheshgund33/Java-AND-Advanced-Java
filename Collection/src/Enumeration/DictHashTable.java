package Enumeration;
import java.util.*;

public class DictHashTable {
	public static void main(String[] args) {
		Dictionary ht = new Hashtable();
		
		ht.put(10,"Mahesh ");
		ht.put(20,"Gund");
		ht.put(30,"Amol");
		ht.put(40,"Virat");
		
		System.out.println(ht);
		
		Enumeration itr1 =ht.keys();
		while(itr1.hasMoreElements()) {
			System.out.println(itr1.nextElement());
		}
		
		Enumeration itr2 =ht.keys();
		while(itr2.hasMoreElements()) {
			System.out.println(itr2.nextElement());
		}
		System.out.println(ht.get(10));
		ht.remove(1);
		System.out.println(ht);
	}
}

//output
//{10=Mahesh , 20=Gund, 30=Amol, 40=Virat}
//10
//20
//30
//40
//10
//20
//30
//40
//Mahesh 
//{10=Mahesh , 20=Gund, 30=Amol, 40=Virat}