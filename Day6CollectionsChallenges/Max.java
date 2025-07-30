package Day6CollectionsChallenges;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Max {

	public static void main(String[] args) {
		List<Integer> numbers=Arrays.asList(10,20,30,40,50);
		int max=Collections.max(numbers);
		int min=Collections.min(numbers);
		System.out.println("max:"+max);
		System.out.println("Min:"+min);
		}

}
