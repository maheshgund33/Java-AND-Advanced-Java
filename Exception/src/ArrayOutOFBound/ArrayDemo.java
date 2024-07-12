package ArrayOutOFBound;

public class ArrayDemo {
	public static void main(String[] args) {
		int arr[]= new int[] {10,20,30,40,50};
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("ArrayOutOf BoUND:->"+ arr[5]);
		}
	}

}


//output 
//ArrayOutOf BoUND:->10
//ArrayOutOf BoUND:->20
//ArrayOutOf BoUND:->30
//ArrayOutOf BoUND:->40
//ArrayOutOf BoUND:->50
//
//
//& Exception
//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 5
//at ArrayOutOFBound.ArrayDemo.main(ArrayDemo.java:8)