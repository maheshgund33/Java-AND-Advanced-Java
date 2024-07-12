package Comparator1;
import java.util.ArrayList;
import java.util.Collections;
public class ListSortDemo {
	
	public static void main(String[] args) {
		
		ArrayList<Movie> al= new ArrayList<>();
		
		al.add(new Movie("Salar", 25000.0,8.9f));
		al.add(new Movie("Family Star", 35000.0,7.5f));
		al.add(new Movie("Panchayat",20000,9.0f));
		al.add(new Movie("Mangal",75000,8.2f));
		
		System.out.println("Sosted By ArrayList: "+al);
		
		Collections.sort(al, new SortByName());
		System.out.println("Name :"+ al);
		
		
		Collections.sort(al, new SortByImdb());
		System.out.println("IMDB Rating: "+ al);
		
		
		Collections.sort(al,new SortBytotcoll());
		System.out.println("Totatl Colllection : "+ al);
	    
	}

}

//output
//Sosted By ArrayList: [Salar:25000.0:0.0, Family Star:35000.0:0.0, Panchayat:20000.0:0.0, Mangal:75000.0:0.0]
//Name :[Family Star:35000.0:0.0, Mangal:75000.0:0.0, Panchayat:20000.0:0.0, Salar:25000.0:0.0]
//IMDB Rating: [Family Star:35000.0:0.0, Mangal:75000.0:0.0, Panchayat:20000.0:0.0, Salar:25000.0:0.0]
//Totatl Colllection : [Panchayat:20000.0:0.0, Salar:25000.0:0.0, Family Star:35000.0:0.0, Mangal:75000.0:0.0]
//
