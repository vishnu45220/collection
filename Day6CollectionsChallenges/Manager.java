package Day6CollectionsChallenges;

import java.util.*;

public class Manager{
    public static void main(String[] args) {
    	List<String> tasks=new ArrayList<String>();
    	tasks.add("Buy Fruits");
    	tasks.add("Sumbit work");
    	tasks.add("call friend");
    	
    	System.out.println("All tasks: "+tasks);
    	tasks.remove("call friend");
    	System.out.println(tasks);
    	
    	System.out.println("pending tasks: "+tasks);
    }
}
