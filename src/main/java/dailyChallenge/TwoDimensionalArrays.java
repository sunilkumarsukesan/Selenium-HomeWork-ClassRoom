package dailyChallenge;

public class TwoDimensionalArrays {

	public static void main(String[] args) {

		//Initialization
		int intArr[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12}};  


		//using for loop to get all the values in the array
		for (int i=0;i<3;i++)
		{
			for (int j=0;j<=3;j++)
			{
				System.out.print(intArr[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
