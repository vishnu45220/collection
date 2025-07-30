package Day6CollectionsChallenges;

import java.util.ArrayList;
import java.util.List;

public class Shopping {

	public static void main(String[] args) {
		ArrayList<String> cart=new ArrayList<String>();
		
		cart.add("Laptop");
		cart.add("Headphones");
		cart.add("Mouse");
		System.out.println("Cart list:"+cart);
		
		cart.remove(1);
		
		System.out.println("Final cart :"+cart);
		

	}

}
