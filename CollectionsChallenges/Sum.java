package CollectionsChallenges;
import java.util.*;

public class Sum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		List<Integer> numbers=new ArrayList<>();
		
		System.out.println("Enter integers: ");
		while(true)
		{
			int num=sc.nextInt();
			if(num==-1)
				break;
			numbers.add(num);
		}
		int sum=0;
		for(int num:numbers)
		{
			sum+=num;
		}
		System.out.println("sum of all numbers is: "+sum);

	}

}
