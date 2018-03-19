package javabasics;

import java.util.Scanner;

public class FactoritalNumber1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fac = 1;
		int numb;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number : ");
		numb = input.nextInt();
		for (int i=numb;i>=1;i--)
		{
			fac = fac *i;
		
		}
		System.out.println("Factorial of the given number is : "+ fac);
	}
}
