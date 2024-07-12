package HashSet1;
import java.util.*;
public class HashSetDemo {
	
	public static void main(String[] args) {
		LinkedHashSet lhs= new LinkedHashSet();
		
		lhs.add(new Criplayer(3,"Mahesh"));
		lhs.add(new Criplayer(5,"Rohit"));
		lhs.add(new Criplayer(6,"Mayur"));
		lhs.add(new Criplayer(4,"Omkar"));
		
		System.out.println("Linked Hash Set Eelement are :"+ lhs);
	}

}
//
//output 
//Linked Hash Set Eelement are :[Criplayer{jerNo=3, name='Mahesh'}, Criplayer{jerNo=5, name='Rohit'}, Criplayer{jerNo=6, name='Mayur'}, Criplayer{jerNo=4, name='Omkar'}]