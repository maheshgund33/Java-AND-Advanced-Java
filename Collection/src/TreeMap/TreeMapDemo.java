package TreeMap;
import java.util.*;
public class TreeMapDemo {
	public static void main(String[] args) {
		
		TreeMap tm= new TreeMap();
		tm.put("India","MSD");
		tm.put("SK","Shangakara");
		tm.put("ABD", "Aust");
		tm.put("WestI", "Gail");
		
		System.out.println(tm);	
	}

}

//output 
//{ABD=Aust, India=MSD, SK=Shangakara, WestI=Gail}