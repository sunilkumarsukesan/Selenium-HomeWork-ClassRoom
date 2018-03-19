package dailyChallenge;

import java.util.Scanner;

public class ReversingTheNumber {

	public static void main(String[] args) {

		// Initialization
		int inputNumber,remainder=0,reverseNumber=0;
		boolean negativeFlag = false;

		//Getting input
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number : ");
		inputNumber = input.nextInt();
		input.close();

		//checking whether input number is positive or negative
		if (inputNumber < 0)
		{
			inputNumber = -1* inputNumber;
			negativeFlag = true;
		}
		
		while (inputNumber>0)
		{
			remainder = inputNumber%10;
			inputNumber = inputNumber/10;
			reverseNumber = reverseNumber*10 + remainder;
		}
		
		if(negativeFlag)
		{
			System.out.println("Reversed number = "+ (-1*(reverseNumber)));
		}
		else
		{
			System.out.println("Reversed number = "+ reverseNumber);
		}
	}
}
