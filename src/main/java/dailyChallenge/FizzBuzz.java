package dailyChallenge;

import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {

		//Initialization
		int numberA,numberB;

		//Getting input from the user
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Number 'A': ");
		numberA = input.nextInt();
		System.out.println("Enter Number 'B': ");
		numberB = input.nextInt();
		input.close();
		System.out.println("\n"); 
		
		//ensuring numberB is greater than numberA
		if(numberB>numberA)
		{
			//setting the range from numberA to NumberB and checking each number in the range is getting divisible by 3 and 5
			for(int i=numberA;i<=numberB;i++)
			{
				if((i%3)==0 && ((i%5)==0))
				{
					System.out.print("FIZZBUZZ ");
				}
				else if((i%3)==0 && ((i%5)!=0))
				{
					System.out.print("FIZZ ");
				}
				else if((i%3)!=0 && ((i%5)==0))
				{
					System.out.print("BUZZ ");
				}
				else if((i%3)!=0 && ((i%5)!=0))
				{
					System.out.print(i+" ");
				}

			}
		}
		else
		{
			System.out.println("NumberB should be greater than numberA");
		}

	}
}