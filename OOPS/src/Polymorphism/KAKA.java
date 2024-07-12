package Polymorphism;

public class KAKA {
	
	public static void main(String[] args) {
		// overriideng 
	   Mahesh mh = new Mahesh();
	   mh.properties();
	   mh.career();
	   mh.Marry();
	   
	  
	   
	   BABA b1 = new BABA();
	   b1.properties();
	   b1.career();
	   b1.Marry();
	   
	   
	   BABA b = new Mahesh();
	   b.properties();
	   b.career();
	   b.Marry();
			   }

}

//output

//Banglow 
//Mi Engineer Zalo 
//Mala vatel tya muli sbt lagna 
//Banglow 
//Mahesh la Doctore karayche 
// amhi bolele tya Muli Sbt lagna 
// Banglow 
//Mi Engineer Zalo 
//Mala vatel tya muli sbt lagna 
