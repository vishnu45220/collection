package Day6CollectionsChallenges;

import java.util.ArrayList;
import java.util.List;

public class Insert {

	public static void main(String[] args) {
		List<String> name=new ArrayList<String>();
		name.add("Vishnu");
		name.add("Manoj");
		name.add("Ravi");
		name.add(1, "Balu");
		System.out.println(name);

	}

}
