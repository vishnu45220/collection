package Day6CollectionsChallenges;

import java.util.HashMap;

public class Studentmarks {

	public static void main(String[] args) {
		HashMap<String, Integer> stud=new HashMap<String, Integer>();
		stud.put("Vishnu", 76);
		stud.put("Vinay", 89);
		stud.put("Ram",78);
		
		System.out.println("Student marks");
		for(String name:stud.keySet())
		{
			System.out.println(name+" "+stud.get(name));
		}

	}

}
