package Encapsulation;

public class IPL{
	
	 String name="MSD";
	 int Run=520;
	 
	 static int totalruns=5240;
	 
	 void info() {
		 System.out.println("Orange cap "+ name);
		 System.out.println("Orange cap "+ Run);
		 System.out.println("TotalRuns "+ totalruns);
	 }
	 
	 public static void main(String[] args) {
			
			IPL m=  new IPL();
			m.info();		
		}
	 
	 

}

//output
//Orange cap MSD
//Orange cap 520
//TotalRuns 5240
