package dailyChallenge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class LargestAndSmallestNumber {

	public static void main(String[] args) {
		
		int num;
		ArrayList<Integer> arraylist = new ArrayList<Integer>();
		
		Scanner input = new Scanner (System.in);
		System.out.println("Enter a number :");
		num = input.nextInt();
		input.close();
		
		while (num>0)
		{
			arraylist.add(num%10);
			num = num/10;
		}
		Collections.sort(arraylist);
		if (arraylist.size()<2)
		{
			System.out.println("It is a single digit number");			
		}
		else	
		{
			System.out.println("Largest Number : " + arraylist.get(arraylist.size()-1));
			System.out.println("Smallest Number : " + arraylist.get(0));
		}
	}
	

}
