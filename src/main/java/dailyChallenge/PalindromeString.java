package dailyChallenge;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		//initialization
		String inputString, revString = "";
		
		//Getting input from the user
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string : ");
		
		//Assigning it to inputString
		inputString = input.next();
		
		
		for(int i = inputString.length()-1; i>=0;i--)
		{
		//Appending each and every character of the input string from the last to a string
			revString= revString + inputString.charAt(i);
		}
	
		//Checking whether the reversed string matches with the inputed string
		if (inputString.equalsIgnoreCase(revString))
		{
			System.out.println("Given string is a palindrome");
		}
		else
		{
			System.out.println("Given string is not a palindrome");
		}
	}
	
}
