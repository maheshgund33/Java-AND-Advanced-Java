package Compartor;

public class Employee {
	
	String empName=null;
	float sal=0.0f;
	
	 
	Employee(String empName, float sal){
		this.empName=empName;
		this.sal=sal;
	}
	
	public String toString() {
		return this.empName+ ":"+this.sal;
	}
	

}
