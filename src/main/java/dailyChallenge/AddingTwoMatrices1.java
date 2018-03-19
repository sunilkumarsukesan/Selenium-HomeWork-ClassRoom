package dailyChallenge;

import java.util.Scanner;

public class AddingTwoMatrices1 {
	
	public static void main(String[] args) {

		//Initialization
		int rowsMatA, columnsMatA,rowsMatB,columnsMatB,i,j;

		//Getting the no of rows and columns value from the user
		Scanner input = new Scanner(System.in);
		System.out.println("How many rows do you need for Matrix A? :  ");
		rowsMatA = input.nextInt();

		System.out.println("How many columns do you need for Matrix A?? :  ");
		columnsMatA = input.nextInt();

		System.out.println("How many rows do you need for Matrix B? :  ");
		rowsMatB = input.nextInt();

		System.out.println("How many columns do you need for Matrix B?? :  ");
		columnsMatB = input.nextInt();

		if ((rowsMatA==rowsMatB)&& (columnsMatA==columnsMatB))
				{
			//Initializing a two dimensional array
			int intArrA [] [] = new int [rowsMatA] [columnsMatA];
			int intArrB [] [] = new int [rowsMatB] [columnsMatB];

			//Getting the value for each cell from the user
			for (i=0;i<rowsMatA;i++)
			{
				for (j=0;j<columnsMatA;j++)
				{
					System.out.println("Enter the value of the cell: "+ i+ ","+j +" of Matrix A");
					intArrA [i][j]=  input.nextInt();
				}
			}
			System.out.println("\n  Matrix A");

			//Displaying the obtained values in matrix form
			for (i=0;i<rowsMatA;i++)
			{
				for (j=0;j<columnsMatA;j++)
				{
					System.out.print(intArrA[i][j]+"\t");
				}
				System.out.println();
			}
			System.out.println();
		//Getting the value for each cell from the user
		for (i=0;i<rowsMatB;i++)
		{
			for (j=0;j<columnsMatB;j++)
			{
				System.out.println("Enter the value of the cell: "+ i+ ","+j +" of Matrix B");
				intArrB [i][j]=  input.nextInt();
			}
		}
		input.close();
		System.out.println("\n  Matrix B");

		//Displaying the obtained values in matrix form
		for (i=0;i<rowsMatB;i++)
		{
			for (j=0;j<columnsMatB;j++)
			{
				System.out.print(intArrB[i][j]+"\t");
			}
			System.out.println();
		}
		
		System.out.println("\n Sum of the two matrices A and B");
		
		for (i=0;i<rowsMatB;i++)
		{
			for (j=0;j<columnsMatB;j++)
			{
				System.out.print((intArrA[i][j]+intArrB[i][j])+"\t");
			}
			System.out.println();
		}
		
			}
			
		else
		{
			System.out.println("\nAdding operation cannot be performed since the rows and columns of the two matrices are not the same");
		}
	}
}
