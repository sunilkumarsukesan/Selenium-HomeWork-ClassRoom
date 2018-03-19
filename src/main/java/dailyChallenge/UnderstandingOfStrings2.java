package dailyChallenge;
public class UnderstandingOfStrings2 {
	
	public static void main(String[] args) {
		//initialization
		String [] mystring = {"Hello","World","India","Welcome","Sunil"};
			mystring[3]="Sunil";
		for (int i=mystring.length-1; i>=0;i--)
		{
			for (int j=mystring.length-1; j>=0;j--)
			{
				if(i!=j)
				{
					//System.out.println("Checking string "+mystring[i]+" with "+mystring[j]);
				
				if(mystring[i]==(mystring[j]))
				{
					System.out.println(mystring[i]+" "+ mystring[j]);
				}
				}
			}
		}
	}
}