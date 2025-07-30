package Day6CollectionsChallenges;

import java.util.LinkedHashSet;

public class Insertion {

	public static void main(String[] args) {
		LinkedHashSet<Integer> num =new LinkedHashSet<Integer>();
		num.add(12);
		num.add(32);
		num.add(34);
		num.add(54);
		num.add(12);
		num.add(32);
		System.out.println("Insertion order without duplicates: ");
		for(int insert:num)
		{
			System.out.println(insert);
		}

	}

}
