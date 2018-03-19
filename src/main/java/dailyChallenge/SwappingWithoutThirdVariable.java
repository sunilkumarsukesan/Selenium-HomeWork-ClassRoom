package dailyChallenge;

import java.util.Scanner;

public class SwappingWithoutThirdVariable {

	public static void main(String[] args) {
		
		//Initialization
		String s1,s2;
		
		
		//Getting input from the user
		Scanner input =new Scanner(System.in);
		System.out.println("Enter a string for s1 : ");
		s1 = input.next();
		System.out.println("Enter a string for s2: ");
		s2 = input.next();
		input.close();
		
		System.out.println("\nValue of 's1' before swapping : "+ s1);
		System.out.println("Value of 's2' before swapping : "+ s2);
		
		
		//swapping without third variable
		s1=s1+s2;
		s1 = s1.substring(s1.length(),s1.length()+s2.length()-1);
		System.out.println(s1);
		
		System.out.println("\nValue of 'a' after swapping : "+ s1);
		System.out.println("Value of 'b' after swapping : "+ s2);
		
	}

}
