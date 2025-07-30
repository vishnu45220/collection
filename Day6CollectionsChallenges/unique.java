package Day6CollectionsChallenges;

import java.util.HashSet;

public class unique {

	public static void main(String[] args) {
		HashSet<Integer> rollnum=new HashSet<Integer>();
		rollnum.add(52);
		rollnum.add(50);
		rollnum.add(43);
		rollnum.add(32);
		rollnum.add(52);
		rollnum.add(32);
		
		System.out.println("Uniqueroll number :");
		for(int roll:rollnum)
		{
			System.out.println(roll);
		}

	}

}
