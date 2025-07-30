package Day6CollectionsChallenges;

import java.util.TreeSet;

public class Sorting {

	public static void main(String[] args) {
		TreeSet<Integer> num=new TreeSet<Integer>();
		
		num.add(32);
		num.add(43);
		num.add(21);
		num.add(12);
		num.add(47);
		num.add(41);
		
		System.out.println("Sorted elements :");
		
		for(int sort:num)
		{
			System.out.println(sort);
		}

	}

}
