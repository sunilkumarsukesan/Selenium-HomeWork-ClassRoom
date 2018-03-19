package dailyChallenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PercentageOfUpperLowerAndSpecialCharacters {

	public static void main(String[] args) throws IOException {

		//Initialization
		int ASCII, numberCount=0, upperCaseCount=0, lowerCaseCount=0,specialCase=0;
		String text;

		//Getting input from the user
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a string");
		text = br.readLine();
		
		
		for(int i=0;i<text.length();i++)
		{
			//getting the ASCII value for each character of the password entered
			ASCII =(int)text.charAt(i);

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
		System.out.println("Number of uppercase letters is "+ upperCaseCount+". So percentage is "+ Double.valueOf((upperCaseCount*100/text.length())));
		System.out.println("Number of lowercase letters is "+ lowerCaseCount+". So percentage is "+ Double.valueOf(lowerCaseCount*100/text.length()));
		System.out.println("Number of digits is "+ numberCount +". So percentage is "+ Double.valueOf(numberCount*100/text.length()));
		System.out.println("Number of other characters is "+ specialCase +". So percentage is "+Double.valueOf (specialCase*100/text.length()));
	}

}
