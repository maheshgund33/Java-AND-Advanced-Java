package Inheritance;



public class IPL extends BCCI{
//
//	public IPL(String name) {
//   		super(name);
//	}
//	
	public IPL(String name,int run) {
		super(name,run);
	}
	// IPL 
	public static void main(String[] args) {
		
		
		//IPL m=  new IPL("virat");
		//m.info();	
		IPL m1=new IPL("Rohit",1000);
		m1.info();
	}
}



//output
//Orange cap Rohit
//RUNS :1000
//TotalRuns 5240
