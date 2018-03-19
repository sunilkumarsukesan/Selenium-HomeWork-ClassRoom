package dailyChallenge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DigitsOfTheNumInAscOrderWoDuplicates {

	public static void main(String[] args) {

		//Initialization
		int number=0,out = 0;

		//Initializing set to get non-duplicate values
		Set<Integer> set =  new HashSet<Integer>();

		//Initializing list to get the list of values 
		ArrayList<Integer> arrayList = new ArrayList<Integer>();

		//getting input from the user
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number :");

		//making sure user is not inputting a higher digit number
		try {
			number = input.nextInt();
			input.close();
		} catch (java.util.InputMismatchException e) {
			System.err.println("Please use a lower digit value");
			System.exit(0);
		}  

		//extracting each digit and adding it to the set there by avoiding duplicates
		while (number>0)
		{
			set.add(number%10);
			number = number/10;
		}

		//adding all the set values to a list
		arrayList.addAll(set);

		//sorting the list
		Collections.sort(arrayList);

		//using for loop to display to print the values
		for(int i=0;i<arrayList.size();i++)
		{
			out = out *10 + arrayList.get(i) ;
		}
		System.out.println("Digits of the Number in ascending order without duplicates : "+ out);
	}
}
