package dailyChallenge;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class NumberCombinations {

	public static void main(String[] args) {

		//Initialization
		int number;
		String num;
		Set<String> set = new HashSet<String>();

		//Getting input from the user
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number : ");
		number = input.nextInt();
		input.close();

		//Checking whether input number is of 3 digits
		num = Integer.toString(number);
		if (num.length()==3)
		{
			//checking whether all the digits has the same number
			if((num.charAt(0)==num.charAt(1))&&(num.charAt(0)==num.charAt(2)))
			{
				System.out.println("All the numbers are same, so possible combination is only one i.e "+ num);
			}
			else
			{
				System.out.println("Possible combinations are : ");

				for (int i=0;i<num.length();i++)
				{
					for (int j=0;j<num.length();j++)
					{
						if (i!=j)
						{
							for (int k=0;k<num.length();k++)
							{
								if ((j!=k) &&(i!=k))
								{
									set.add(num.charAt(i)+""+num.charAt(j)+""+num.charAt(k));
								}
							}
						}	
					}
				}
				System.out.println(set);
			}
		}
		else
		{
			System.out.println("X Please input a 3 digit number");
		}
	}
}