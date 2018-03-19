package dailyChallenge;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		
		//Initialization
		int year;

		//Getting input from the user
		Scanner input = new Scanner(System.in);
		System.out.println("To Find whether the given year is leap year or not\n\nEnter the year :");
		year = input.nextInt();
		input.close();
		
		//Checking whether it is a leap year or not

		if((year%100==0)&&(year%400==0))
		{
			System.out.println(year+" is a leap year");
		}
		else if(year%100==0)
		{
			System.out.println(year+" is not a leap year");
		}
		else if(year%4==0)
		{
			System.out.println(year+" is a leap year");
		}
		else
		{
			System.out.println(year+" is not a leap year");
		}

	}

}