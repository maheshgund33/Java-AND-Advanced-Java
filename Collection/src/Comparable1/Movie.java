package Comparable1;
import java.util.*;
public class Movie implements Comparable{
      
	String mstar = null;
	
	float totcall= 10.f;
	
	Movie(String mstar, float totcall ){
		this.mstar= mstar;
		this.totcall= totcall;
	}
	
	public int compareTo(Object obj) {
		return (mstar.compareTo(((Movie )obj).mstar));
	}
	
	public String toString() {
		return mstar;
	}
	
}
