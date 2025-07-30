package Day6CollectionsChallenges;

import java.util.HashMap;
import java.util.Map;

public class phone {

	public static void main(String[] args) {
	   HashMap<String, String> Book=new HashMap<String, String>();
	   
	   Book.put("Vishnu", "88378889182");
	   Book.put("Vinay", "7638728272");
        Book.put("Ravi","767636736");
        
        System.out.println("Phone directory");
        for(Map.Entry<String, String> entry: Book.entrySet())
        {
        	System.out.println(entry.getKey()+" "+entry.getValue());
        }
	}

}
