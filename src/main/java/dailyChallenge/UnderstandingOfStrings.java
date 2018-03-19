package dailyChallenge;

public class UnderstandingOfStrings {
	
	public void compareStrings(String str1, String str2,String str3, String str4, String str5 )
	{
		System.out.println("str1 = "+str1);
		System.out.println("str2 = "+str2);
		System.out.println("str3 = "+str3);
		System.out.println("str4 = "+str4);
		System.out.println("str5 = "+str5);
		
		System.out.println("\nIs str1==str2? " + (str1==str2));
		System.out.println("Is str1.equals(str2)? " + (str1.equals(str2)));
		System.out.println("Is str1==str3? " + (str1==str3));
		System.out.println("Is str1.equals(str3)? " + (str1.equals(str3)));
		System.out.println("Is str1.equalsIgnoreCase(str4)? " + (str1.equalsIgnoreCase(str4)));
		System.out.println("Is str3.contains(str5)? " + (str3.contains(str5)));
		
		System.out.println("\nstr1 = " +str1+", str1.toLowerCase(), " + "str1 = "+str1.toLowerCase());
		System.out.println("str4 = " +str4+", str4.length(), " + "str4 = "+str4.length());
		System.out.println("str4 = " +str4+", str4.substring(4), " + "str4 = "+str4.substring(4));
		System.out.println("str4 = " +str4+", str4.substring(4,8), " + "str4 = "+str4.substring(4, 8));
		System.out.println("str4 = " +str4+", str4.indexOf(\"Leaf\") " + "str4 = "+str4.indexOf("Leaf"));
		System.out.println("str4 = " +str4+", str5 = " +str5+", str4.concat(str5) " + "str4 = "+str4.concat(str5));
		System.out.println("str4 = " +str4+", str4.replace(\"Java\", \"java\") " + "str4 = "+str4.replace("Java", "java"));
		
	}

	public static void main(String[] args) {
		//initialization
		String str1= "TestLeaf Java";
		String str2= "TestLeaf Java";
		String str3= new String ("TestLeaf Java");
		String str4= new String ("testLeaf Java");
		String str5= "Java";
		
		UnderstandingOfStrings objString= new UnderstandingOfStrings();
		objString.compareStrings(str1,str2,str3,str4,str5);
	}
	
}
