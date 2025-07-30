package Day6CollectionsChallenges;

import java.util.LinkedList;

public class Employee {

	public static void main(String[] args) {
		LinkedList<String> employee=new LinkedList<String>();
		employee.add("Vishnu");
		employee.add("Manoj");
		employee.add("Ravi");
		 System.out.println("Employee names: ");
		 
		 for(String name: employee) {
			 System.out.println(name);
		 }
	}
		 
}