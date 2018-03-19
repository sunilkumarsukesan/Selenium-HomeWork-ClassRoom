package dailyChallenge;

import java.util.Scanner;

public class NumbersAndDigits {

	public static void main(String[] args) {
		//Initialization
		int number, digit, count;

		//Getting inputs from the user, one for the number and another for digit
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number : ");
		number = input.nextInt();
		System.out.println("Enter the digit : ");
		digit = input.nextInt();
		input.close();

		//using for loop to decrement the number by 1 for each iteration
		for (int i=number-1;i>=0;i--)
		{
			count=0;
			number=i;

			//checking whether each digit of the number is equal to the entered digit by the user
			while(number>0)
			{

				if (number%10==digit)
				{
					count = count +1;
					break;
				}
				number=number/10;
			}
			if (count ==0)
			{
				System.out.println(i);
				break;
			}
		}
	}
}