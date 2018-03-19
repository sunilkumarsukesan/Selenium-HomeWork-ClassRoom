package dailyChallenge;

import java.util.Scanner;

public class ReversingTheNumberUsingString {

	public static void main(String[] args) {

		// Initialization
		int inputNumber;
		String revNum;
		
		//Getting input
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number : ");
		inputNumber = input.nextInt();
		input.close();

		revNum = Integer.toString(inputNumber);
		System.out.println("Reversed Number :");
		for (int i=revNum.length()-1; i>=0;i--)		
		{
			System.out.print(revNum.charAt(i));
		}
	}
}