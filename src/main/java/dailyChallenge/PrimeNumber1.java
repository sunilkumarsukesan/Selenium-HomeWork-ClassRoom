package dailyChallenge;

import java.util.Scanner;

public class PrimeNumber1 {

	public static void main(String[] args) {
		
		// Initialization
		int divisibleBy[] = {1,2,3,4,5,6,7,8,9};
		int inputNumber;
		boolean primeFlag = true;
		
		//Getting input
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number : ");
		inputNumber = input.nextInt();
		
		for (int i:divisibleBy)
		{
			if (inputNumber%divisibleBy[i]==0)
			{
				primeFlag = false;
			}
			break;
		}
		
		if(primeFlag==true)
		{
			System.out.println(inputNumber + " is a prime number");
		}
		else
		{
			System.out.println(inputNumber + " is not a prime number");
		}
		input.close();
	}

}
