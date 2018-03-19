package dailyChallenge;

public class RepeatedNumbersInTheArray {

	public static void main(String[] args) {
		int arrA [] = {1,2,3,4,5,1,2};
		int count=0;
		System.out.println("Checking duplicates..");
		for (int i=0;i<arrA.length;i++)
		{
			for (int j=i+1;j<arrA.length;j++)
			{
				if(arrA[i]==arrA[j])
				{
					System.out.println(arrA[i]);
					count = count+1;
				}
			}
		}
		if(count==0)
		{
			System.out.println("No Duplicate numbers in the array");
		}
	}
}
