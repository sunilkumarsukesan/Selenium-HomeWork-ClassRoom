package javabasics;

public class ArithmeticOps {
	int addTwoNumbers(int i, int j)
	{
		int k = i +j;
		return k;	
	}
	int subTwoNumbers(int i, int j)
	{
		int k = i  -j;
		return k;	
	}
	int mulTwoNumbers(int i, int j)
	{
		int k = i * j;
		return k;	
	}
	int divTwoNumbers(int i, int j)
	{
		int k = i /j;
		return k;	
	}
	int powTwoNumbers(int i, int j)
	{
		int k=1;
		for (int s=0;s>=j;s++)
		{
			k = k*i;
			
		}
		return k;
	}
	int remTwoNumbers(int i, int j)
	{
		int k = i%j;
		return k;	
	}

}
