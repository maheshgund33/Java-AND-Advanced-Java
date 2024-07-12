package IteratorMap;
import java.util.*;
public class IteratorMapDemo {
	
	public static void main(String[] args) {
		SortedMap tm = new TreeMap();
		tm.put("Ind", "India");
		tm.put("pak","Pakistan");
		tm.put("SL","ShriLank");
		
		System.out.println(tm);
		
		Set<Map.Entry> data =tm.entrySet();
		Iterator<Map.Entry> itr = data.iterator();
		
		while(itr.hasNext()) {
			Map.Entry abc = itr.next();
			System.out.println(abc.getKey()+":"+ abc.getValue());
		}
		
	}

}
//output
//{Ind=India, SL=ShriLank, pak=Pakistan}
//Ind:India
//SL:ShriLank
//pak:Pakistan
