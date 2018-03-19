package dailyChallenge;

import java.util.Scanner;

public class ArithmeticOperations {

	public static void main(String[] args) {

		//Initialization
		int numberA,numberB;
		String operation;

		//Getting input from the user
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Number 'A': ");
		numberA = input.nextInt();
		System.out.println("Enter Number 'B': ");
		numberB = input.nextInt();
		System.out.println("\nList of operations that can be performed\nAdd\nSub\nMul\nDiv");
		System.out.println("\nEnter the operation that you need to perform (Case Sensitive): ");
		operation = input.next();
		input.close();

		//Using switch case to perform the expected arithmetic operation
		switch(operation)
		{
		case "Add":
			System.out.println("\nAddition of "+numberA+" and "+numberB+" is "+ (numberA+numberB));
			break;
		case "Sub":
			System.out.println("\nSubtraction of "+numberB+" from "+numberA+" is "+ (numberA-numberB));
			break;
		case "Mul":
			System.out.println("\nMultiplication of "+numberA+" and "+numberB+" is "+ (numberA*numberB));
			break;
		case "Div":
			System.out.println("\nDivision of "+numberA+" and "+numberB+" is "+ (numberA/numberB));
			break;
		default:System.out.println("Invalid Operation");  
		}
	}
}
