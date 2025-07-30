package Day6CollectionsChallenges;

import java.util.HashSet;

public class Nodupicates {

	public static void main(String[] args) {
		HashSet<String> email=new HashSet<String>();
		
		email.add("davanamvishnu@gmail.com");
		email.add("ravi@gmail.com");
		email.add("Manoj@gnmail.com");
		email.add("davanamvishnu@gmail.com");
		
		System.out.println("email ids are: ");
		for(String emails:email)
		{
			System.out.println(emails);
		}

	}

}
