package Day6CollectionsChallenges;

import java.util.LinkedList;
import java.util.Queue;

public class Task {

	public static void main(String[] args) {
		Queue<String> tasks=new LinkedList<>();
		tasks.add("1:coding");
		tasks.add("2:testing");
		tasks.add("3:Deploy");
		
		System.out.println("Processing tasks: ");
		while(!tasks.isEmpty())
		{
			System.out.println(tasks.poll());
		}
	}

}
