package dailyChallenge;

import java.util.Arrays;

public class FindingSecondMaxNumberInTheArray {

	public static void main(String[] args) {
		int arrA [] = {20,340,21,879,92,21,474,83647,-200};
		int count =0;
		
		//using inbuilt method to sort the array
		Arrays.sort(arrA);
		
		//checking whether max value is getting duplicated, if so next value in the array will be considered
		for(int j =2;j<=arrA.length;j++)
		{
		if (arrA[arrA.length-1]!=arrA[arrA.length-j])
		{
		count = count+1;
		System.out.println("Second max value in the array is "+arrA[arrA.length-j]);
		break;
		}
		}
		if(count==0)
		{
			System.out.println("All the values in the array are same!");
		}
	}
}