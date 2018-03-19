package dailyChallenge;

import java.util.ArrayList;

public class FindingPositiveSequenceAndItsLength {

	public static void main(String[] args) {
		//Initialization
		int arrA [] = {11,1,1,1,-2,3,4,5,6,-7,8,-9,10,1,11,12,13,-14,-9,15,16,17,18};
		int count =0;
		boolean flag = true;
		ArrayList<Integer> tempList = new ArrayList<Integer>();
		ArrayList<Integer> temp1List = new ArrayList<Integer>();
		ArrayList<Integer> tempEqualList = new ArrayList<Integer>();

		for (int i=0; i<arrA.length;i++)
		{
			if(arrA[i]>0)
			{
				if (flag)
				{
					tempList.add(arrA[i]);
				}
				else
				{
					temp1List.add(arrA[i]);
				}
			}
			else
			{
				if ((tempList.size()>temp1List.size())&& (tempList.size()!=count))
				{
					temp1List.clear();
					flag = false;
				}
				else if ((tempList.size()<temp1List.size()) && (tempList.size()!=count))
				{
					tempList.clear();
					flag = true;
				}
				else if ((tempList.size()==temp1List.size())||(tempList.size()==count)||(temp1List.size()==count))
				{
					if (count ==0)
					{
					tempEqualList.addAll(tempList);
					tempEqualList.addAll(temp1List);
					count = tempList.size();
					tempList.clear();
					temp1List.clear();
					flag=true;
					}
					else if (tempList.size()==count)
					{
						tempEqualList.addAll(tempList);
						tempList.clear();
						temp1List.clear();
						flag=true;
					}
					else if (temp1List.size()==count)
					{
						tempEqualList.addAll(temp1List);
						tempList.clear();
						temp1List.clear();
						flag=true;
					}
				}
			}
		}
		if ((tempList.size()>temp1List.size())&& (tempList.size()!=count))
		{
			System.out.println("The longest positive sequence is : " + tempList);
			System.out.println("Length of the longest positive sequence is : "+ tempList.size());
		}
		else if ((tempList.size()<temp1List.size())&& (temp1List.size()!=count))
		{
			System.out.println("The longest positive sequence is : " + temp1List);
			System.out.println("Length of the longest positive sequence is : "+ temp1List.size());
		}
		else if ((tempList.size()==temp1List.size())||(tempList.size()==count)||(temp1List.size()==count))
		{
			
			tempEqualList.addAll(temp1List);
			if(tempList.size()==count)
			{
				tempEqualList.addAll(tempList);
			}
			else if (temp1List.size()==count)
			{
				tempEqualList.addAll(temp1List);
			}
			System.out.println("There are "+ (tempEqualList.size()/count)+ " positive sequence of length "+count);
			for (int i=0;i<tempEqualList.size();i++)
			{
				System.out.print(tempEqualList.get(i)+"\t");
				if(((i+1)%count)==0)
				{
					System.out.println();
				}
				
			}
			System.out.println("\nLength of the longest positive sequence is : "+ count);
		}
	}
}