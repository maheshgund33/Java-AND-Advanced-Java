package Comparable;
import java.util.*;
public class MyClass implements Comparable{
	String str = null;
	
	MyClass(String str){
		this.str= str;
	}
	
	public int compareTo(Object obj ) {
       return str.compareTo(((MyClass)obj).str);
	 }
	
	
	public String toString() {
		return str;
	}
}


