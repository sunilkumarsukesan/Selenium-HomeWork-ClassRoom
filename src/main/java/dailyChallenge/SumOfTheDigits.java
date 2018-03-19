package dailyChallenge;

import java.util.Scanner;

public class SumOfTheDigits {

	public static void main(String[] args) {

		// Initialization
		int inputNumber,remainder=0,sum=0;
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
		
		while (inputNumber/10>0)
		{
			remainder = inputNumber%10;
			inputNumber = inputNumber/10;
			sum= sum+remainder;
		}
		
		if(negativeFlag)
		{
			System.out.println("Sum of the digits = "+ (-1*(sum+inputNumber)));
		}
		else
		{
			System.out.println("Sum of the digits = "+ (sum+inputNumber));
		}
	}
}
