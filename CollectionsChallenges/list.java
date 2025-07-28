package CollectionsChallenges;

import java.util.ArrayList;
import java.util.List;

public class list {

	public static void main(String[] args) {
		List<String> names=new ArrayList<>();
		names.add("Vishnu");
		names.add("Ravi");
		names.add("Manoj");
		
		System.out.println("Original names: "+names);
		
		names.remove("Ravi");
		System.out.println("After removing: "+names);
		
		System.out.println("accessing 1st element: "+names.get(0));
		

	}

}
