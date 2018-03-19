package dailyChallenge;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		// Initialization
		int inputNumber;
		boolean primeFlag = true;

		//Getting input
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number : ");
		inputNumber = input.nextInt();

		if (inputNumber>=2)
		{
			//Checking whether the given number is divisible by any other numbers
			for(int i=2;i<=inputNumber/2;i++)
			{

				// setting the primeFlag to false if it is divisible
				if (inputNumber%i==0)
				{
					primeFlag = false;
					break;
				}

			}
			if(primeFlag)
			{
				System.out.println(inputNumber + " is a prime number");
			}
			else
			{
				System.out.println(inputNumber + " is not a prime number");
			}
			input.close();
		}
		else if ((inputNumber==0) ||(inputNumber==1))
		{
			System.out.println(inputNumber + " is neither a prime nor a composite number");
		}
		else
		{
			System.out.println("Please enter a positive value");
		}

	}

}
