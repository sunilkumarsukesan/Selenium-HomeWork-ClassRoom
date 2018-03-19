package dailyChallenge;

import java.util.ArrayList;
import java.util.Scanner;

public class StaticAndNonStatic {


	public void allFactors(ArrayList<Integer> factors, int num) {
		System.out.println("Factors of "+ num + " are : " + factors);
	}

	public static void primeFactors(ArrayList<Integer> factors, int num) {
		boolean primeFlag = true;
		int facNumber;
		ArrayList<Integer> primeFactors = new ArrayList<Integer>();
		for(int i =0; i<factors.size()-1;i++)
		{
			facNumber = factors.get(i);
			if (facNumber>=2)
			{
				//Checking whether the given number is divisible by any other numbers
				for(int j=2;j<=facNumber/2;j++)
				{

					// setting the primeFlag to false if it is divisible
					if (facNumber%j==0)
					{
						primeFlag = false;
						break;
					}

				}
				if(primeFlag)
				{
					primeFactors.add(facNumber);
				}
			}
		}
		if ((primeFactors.size()<2) && (primeFactors.size()!=0))
		{
			System.out.println("Prime Factor of "+ num + " is : " + primeFactors);
		}
		else if (primeFactors.size()!=0)
		{
			System.out.println("Prime Factors of "+ num + " are : " + primeFactors);
		}
	}

	public static void main(String[] args) {

		int number;
		ArrayList<Integer> factors = new ArrayList<Integer>();

		//getting input from the user
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number : ");
		number = input.nextInt();
		input.close();


		for(int i=1;i<=number;i++)
		{

			if(number%i==0)
			{
				factors.add(i);
			}
		}

		StaticAndNonStatic obj = new StaticAndNonStatic();
		obj.allFactors(factors, number);
		primeFactors(factors, number);

	}
}
