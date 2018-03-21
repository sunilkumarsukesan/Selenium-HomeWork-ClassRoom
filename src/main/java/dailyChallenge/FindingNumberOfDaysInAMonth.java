package dailyChallenge;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class FindingNumberOfDaysInAMonth {

	//Initialization
	static int month, year, days;
	static int monthHas31days[] = {1,3,5,6,8,10,12};
	static int monthHas30days[] = {4,7,9,11};
	static boolean AreDaysRetrieved = false;

	public static void main(String[] args) {
		//Getting the input from the user
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of the month :");
		month = input.nextInt();
		System.out.println("Enter the year : ");
		year = input.nextInt();
		input.close();

		if ((month>=1)&&(month<=12))
		{
		if (month==2)
		{
			days = leapYearCheck();
		}
		else
		{
			for(int i=0;i<monthHas31days.length;i++)
			{
				if(monthHas31days[i]==month)
				{
					days = 31;
					AreDaysRetrieved = true;
				}
			}
			if(!AreDaysRetrieved)
			{

				for(int i=0;i<monthHas30days.length;i++)
				{
					if(monthHas30days[i]==month)
					{
						days = 30;
					}
				}
			}
		}
		Calendar result = new GregorianCalendar();
		result.set(Calendar.MONTH, month-1);
		SimpleDateFormat month = new SimpleDateFormat("MMMM");
		System.out.println(month.format(result.getTime())+ " "+year+" has "+ days+ " days");
		}
		else
		{
			System.err.println("Enter a valid month");
		}
	}

	public static int leapYearCheck() {
		if((year%100==0)&&(year%400==0)||(year%4==0))
		{
			return 29;
		}
		else
		{
			return 28;
		}
	}
}
