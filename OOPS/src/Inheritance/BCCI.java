package Inheritance;

public class BCCI  {
	

  // BCCI 
	 String name="MSD";
	 int Run=520;
	 
	 static int totalruns=5240;
	 
//	 public BCCI(String name) {
//		 this.name=name;
//	 }
	 public BCCI(String name,int run) {
		 this.name=name;
		 this.Run=run;
	 }
	 void info() {
		 System.out.println("Orange cap "+ name);
		 System.out.println("RUNS :"+ Run);
		 System.out.println("TotalRuns "+ totalruns);
	 }

	
	
	 
	


}
