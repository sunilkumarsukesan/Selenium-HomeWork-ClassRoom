package dailyChallenge;

public class UnderstandingOfOperators {

	public void operators(String operator)
	{
		boolean flagi = false, flagj = false;
		//creating object to call settingFlag method
		UnderstandingOfOperators operatorsObj1 = new UnderstandingOfOperators();
		for (int i =0; i<2;i++)
		{
			for (int j=0;j<2;j++)
			{
				//using settingFlag method to assign boolean values to flagi and flagj
				flagi=  operatorsObj1.settingFlags(i);
				flagj = operatorsObj1.settingFlags(j);
				
				if(operator.equalsIgnoreCase("OR"))
				{
				System.out.println(flagi + " || " + flagj +" = " + (flagi||flagj));
				}
				else if(operator.equalsIgnoreCase("AND"))
				{
				System.out.println(flagi + " && " + flagj +" = " + (flagi&&flagj));
				}
			}
		}

	}

	public boolean settingFlags(int inputFromOperatorsMethod)
	{
		if(inputFromOperatorsMethod==0)
		{
			return false;
		}
		else
		{
			return true;
		}

	}

	public static void main(String[] args) {
		//Initialization

		int num1 = 5;
		int num2 = 8;
		boolean flag = true;

		//Understanding increment operator
		System.out.println("num1 = "+ num1 + ", where num1++ = " + num1++);
		System.out.println("num2 = "+ num2 + ", where ++num2 = " + ++num2);

		//Understanding decrement operator
		System.out.println("\nnum1 = "+ num1 + ", where num1-- = " + num1--);
		System.out.println("num2 = "+ num2 + ", where --num2 = " + --num2);

		//Understanding Logical Not operator
		System.out.println("\nflag is set to " + flag + " on using Logical Not (!) it gets changed to " + !flag);
		
		//Creating object to call the operators method
		UnderstandingOfOperators operatorsObj = new UnderstandingOfOperators();
		System.out.println("\n-----Logical AND operator------");
		operatorsObj.operators("AND");
		System.out.println("\n-----Logical OR operator-------");
		operatorsObj.operators("OR");

	}

}
