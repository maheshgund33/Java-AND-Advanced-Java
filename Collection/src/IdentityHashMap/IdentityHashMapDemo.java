package IdentityHashMap;
import java.util.*;
public class IdentityHashMapDemo {
  public static void main(String[] args) {
	  
	  IdentityHashMap idhm= new IdentityHashMap();
	  
	  idhm.put(new Integer(101),"Mahesh");
	  idhm.put(new Integer(101),"Mayur");
	  idhm.put(new Integer(101),"Amol");
	  idhm.put(new Integer(101),"Rohit");
	  System.out.println(idhm);
	  
	  
  }
}

//output
//{101=Mahesh, 101=Amol, 101=Rohit, 101=Mayur}