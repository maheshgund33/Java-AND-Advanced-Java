package Curror;

import java.util.ArrayList;

public class CurrorDemo {
	public static void main(String[] args) {
		ArrayList<Object> al= new ArrayList();
		
		al.add(10);
		al.add(220);
		al.add(30.1f);
		al.add("Mahesh");
		
		for(Object x: al) {
			System.out.println(x.getClass().getName());
		}
	}

}

////output
//java.lang.Integer
//java.lang.Integer
//java.lang.Float
//java.lang.String
