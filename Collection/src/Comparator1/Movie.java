package Comparator1;

public class Movie {
	
	String mname=null;
	double totcoll=0.00;
	float Imdb=0.0f;
	
	Movie(String mname,double totcoll,float Imdb){
		this.mname=mname;
		this.totcoll=totcoll;
		this.Imdb=0.00f;
		
	}
	
	public String toString() {
		return this.mname+":"+this.totcoll+":"+this.Imdb;
	}

}
