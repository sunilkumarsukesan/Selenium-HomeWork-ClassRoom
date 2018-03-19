package dailyChallenge;

import java.util.Scanner;

public class TwoDimensionalArraysInputFromTheUser {

	public static void main(String[] args) {

		//Initialization
		int rows, columns,i,j;

		//Getting the no of rows and columns value from the user
		Scanner input = new Scanner(System.in);
		System.out.println("How many rows do you need? :  ");
		rows = input.nextInt();

		System.out.println("How many columns do you need? :  ");
		columns = input.nextInt();


		//Initializing a two dimensional array
		int intArr [] [] = new int [rows] [columns];

		//Getting the value for each cell from the user
		for (i=0;i<rows;i++)
		{
			for (j=0;j<columns;j++)
			{
				System.out.println("Enter the value of the cell: "+ i+ ","+j);
				intArr[i][j]=  input.nextInt();
			}
		}
		input.close();
		System.out.println();
		
		//Displaying the obtained values in matrix form
		for (i=0;i<rows;i++)
		{
			for (j=0;j<columns;j++)
			{
				System.out.print(intArr[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
