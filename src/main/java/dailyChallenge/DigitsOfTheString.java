package dailyChallenge;

import java.util.Scanner;

public class DigitsOfTheString {

	public static void main(String[] args) {

		String number;
		int ASCII;
		boolean status = true;

		Scanner input = new Scanner (System.in);
		System.out.println("Enter a number : ");
		number = input.next();
		input.close();

		if(number.length()==5)
		{
			for (int i=0;i<number.length();i++) {
				
				//0-9 = 48 to 57
				ASCII= (int) number.charAt(i);
				if (!((ASCII>47)&&(ASCII<58)))
				{
					status = false;
					break;
				}
			}
			if(status)
			{
				System.out.println("Entered number "+ number +" has exactly 5 digits");
			}
			else
			{
				System.out.println("Entered number "+ number +" doesnt has exactly 5 digits");
			}	
		}
		else
		{
			System.out.println("Entered number "+ number +" doesnt has exactly 5 digits");
		}
	}
}
