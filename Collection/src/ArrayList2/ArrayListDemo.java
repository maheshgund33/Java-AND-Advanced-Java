package ArrayList2;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
		
		ArrayList arr= new ArrayList();
		arr.add(new Criplayer(18,"Mahesh "));
		arr.add(new Criplayer(19,"Omkar"));
		arr.add(new Criplayer(20,"Tejas"));
		arr.add(new Criplayer(21,"Akshay"));
		
		System.out.println("Array la call: "+ arr);
	}

}
//
//output: >> Array la call: [Mahesh , Omkar, Tejas, Akshay]
