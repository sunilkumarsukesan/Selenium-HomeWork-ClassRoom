package dailyChallenge;

public class ArmstrongNumber {

	public static void main(String[] args) {
		//Initialization
		int number,number1, temp, count = 0;
		double sum=0;
		
		//for loop to run the series till 1000
		for(number=1; number<=1000;number++)
		{
			//resetting the values
			number1=number;
			count=0;
			sum=0;
			
			//extracting the no of digits
			while(number1>0)
			{
				temp = number1%10;
				number1=number1/10;
				count = count+1;
			}
			
			//resetting the number
			number1=number;
			
			//calculating the sum of the power of their digits
			while(number1>0)
			{
				temp = number1%10;
				sum =sum+ Math.pow(temp, count);
				number1=number1/10;
			}
			if(number==sum)
			{
				System.out.println(number);
			}

		}

	}

}
