package dailyChallenge;

import java.util.Scanner;

public class AddingTwoMatrices {

	public int [] [] matrices(char matrix, int rowsMat, int columnsMat) {
		int i, j;
		int intArr [][]= new int [rowsMat][columnsMat];
		Scanner input = new Scanner(System.in);
		
		for (i=0;i<rowsMat;i++)
		{
			for (j=0;j<columnsMat;j++)
			{
				System.out.println("Enter the value of the cell: "+ i+ ","+j +" of Matrix "+ matrix);
				intArr [i][j] =  input.nextInt();
			}
		}
		System.out.println("\n  Matrix "+ matrix);

		//Displaying the obtained values in matrix form
		for (i=0;i<rowsMat;i++)
		{
			for (j=0;j<columnsMat;j++)
			{
				System.out.print(intArr[i][j]+"\t");
			}
			System.out.println();
		}
			
			input.close();
			return intArr;
	}

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
			AddingTwoMatrices objMatrices = new AddingTwoMatrices();
			objMatrices.matrices('A',rowsMatA,columnsMatA);
			AddingTwoMatrices objMatrices1 = new AddingTwoMatrices();
			objMatrices1.matrices('B',rowsMatB,columnsMatB);
		}

		else
		{
			System.out.println("\nAdding operation cannot be performed since the rows and columns of the two matrices are not the same");
		}
	}
}
