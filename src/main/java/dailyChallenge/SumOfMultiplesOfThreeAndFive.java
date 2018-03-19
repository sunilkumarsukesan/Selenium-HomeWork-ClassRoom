package dailyChallenge;

import java.util.Scanner;

public class SumOfMultiplesOfThreeAndFive {

	public static void main(String[] args) {
		
		//initialization
		int limit, sum =0;
		
		//getting input from the user
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the limit : ");
		limit = input.nextInt();
		input.close();
		
		//iterating till less than 100
		for(int i=1;i<limit;i++)
		{
			//checking the iterated number is divisible by 3 or 5
			if(i%3==0||i%5==0)
			{
				sum = sum+i;
			}
			
		}
		System.out.println("Sum of all multiples of 3 and 5 less than "+ limit+ " is : "+ sum);
		
	}

}
