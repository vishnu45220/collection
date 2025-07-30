package Day6CollectionsChallenges;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sort {

	public static void main(String[] args) {
		List<String> cities=new ArrayList<>();
		cities.add("Banglore");
		cities.add("Hyderabad");
		cities.add("Chennai");
		cities.add("Pune");
		cities.add("Mumbai");
		
		Collections.sort(cities);
		System.out.println("sorted cities: "+cities);
		

	}

}
