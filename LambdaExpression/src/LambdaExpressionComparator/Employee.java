package LambdaExpressionComparator;
import java.util.*;
public class Employee {
	
	int empId=0;
	String name = null;
	
	Employee(int empId,String name){
		this.empId= empId;
		this.name=name;
	}
	
	public String toString() {
		return empId+ ":"+name;
		
	}
	

}
