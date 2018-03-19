package dailyChallenge;

import java.util.Scanner;

public class PasswordCheck {

	public static void main(String[] args) {
		
		//Initialization
		int ASCII, numberCount=0, upperCaseCount=0, lowerCaseCount=0,specialCase=0;
		String password;
		
		//Getting input from the user
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a password : ");
		password = input.next();
		
		//Checking whether password contains atleast 10 characters
		if (password.length()>=10)
		{
			for(int i=0;i<password.length();i++)
			{
				//getting the ASCII value for each character of the password entered
				ASCII =(int)password.charAt(i);
				
				//checking whether the ASCII value falls on the below,
				//0-9 = 48 to 57
				//A-Z = 65 to 90
				//a-z = 97 to 122
				
				if((ASCII>=48)&&(ASCII<=57))
				{
					numberCount=numberCount+1;
				}
				else if((ASCII>=65)&&(ASCII<=90))
				{
					upperCaseCount=upperCaseCount+1;
				}
				else if((ASCII>=97)&&(ASCII<=122))
				{
					lowerCaseCount=lowerCaseCount+1;
				}
				else
				{
					specialCase = specialCase +1;
				}
			}
			
			//checking whether the entered password matches with the given condition
			if((specialCase==0)&&(numberCount>=2)&&(upperCaseCount>=1)&&((upperCaseCount+lowerCaseCount)>=2))
			{
				System.out.println("\nPassword validation success!");
			}
			else
			{
				System.out.println("\nPassword validation failed\n"
						+ "Your password should match with the below conditions.\n1.Password must contain only letters and digits"
						+ "\n2.Password must contain atleast two digits and two letters\n3.Password must contain atleast one capital letter");
			}
		}
		else
		{
			System.out.println("*** Password should have atleast 10 characters. Please enter a valid password!***");
		}
		input.close();
	}
}
