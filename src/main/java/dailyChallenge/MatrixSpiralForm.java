package dailyChallenge;

public class MatrixSpiralForm {

	public static void main(String[] args) {
		
		//initialization
		int numSeries =1;
		int intArr [] [] = new int [4] [4];

		//for loop to display the array values in matrix format
		for(int i=0;i<=3;i++)
		{
			for(int j=0;j<=3;j++)
			{
				System.out.print(numSeries + "\t");
				intArr[i][j]=numSeries;
				numSeries++;
			}
			System.out.println();
		}
		
		System.out.println("\n\nOutput in spiral form : ");
		for(int i=0;i<=3;i++)
		{
			//checking whether it is an odd or even row, if it is odd then its iteration starts from right and if it even it starts from left
			if(i%2==0)
			{
				for(int j=0;j<=3;j++)
				{
					System.out.print(intArr[i][j] + "\t");
				}
			}
			else
			{
				for(int j=3;j>=0;j--)
				{
					System.out.print(intArr[i][j] + "\t");
				}
			}
		}

	}

}
