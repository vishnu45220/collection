package Day6CollectionsChallenges;

import java.util.HashMap;

public class Update {

	public static void main(String[] args) {
		HashMap<String, Integer> stock=new HashMap<String, Integer>();
		 stock.put("Apple", 100);
		 stock.put("Banana", 67);
		 stock.put("mango", 80);
		 System.out.println("before update:"+stock);
		 
		 stock.put("mango", 100);
		 System.out.println("After update :"+stock);
		 
		 

	}

}
