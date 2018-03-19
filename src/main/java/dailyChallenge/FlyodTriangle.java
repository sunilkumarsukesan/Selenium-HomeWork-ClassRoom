package dailyChallenge;

import java.util.Scanner;

public class FlyodTriangle {

	public static void main(String[] args) {
		//Initialization		
		int rows,number=1;
		
		//Getting input from the user
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the no. of rows : ");
		
		//assigning it to rows
		rows = input.nextInt();
		input.close();
		System.out.println();
		
		//using for loop to print the numbers in the form of flyod triangle
		for(int i =0;i<rows;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(number+"\t");
				number= number+1;
			}
			System.out.println();
		}
	}

}
