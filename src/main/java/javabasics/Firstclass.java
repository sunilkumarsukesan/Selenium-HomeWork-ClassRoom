package javabasics;

import java.util.Scanner;

import secondPackage.ThirdClass;

public class Firstclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner input= new Scanner(System.in);
		System.out.println("Enter your name : ");
		*/
		/*String name = "Vijay";
		System.out.println("My name is " + name + ". It's my first program.");
		
		SecondClass obj = new SecondClass();
		obj.age = 20;
		obj.height = 5.0f;
		obj.isMarried = false;
		obj.name = "Sunil";
		
		System.out.println("My name is "+ obj.name);
		System.out.println("My age is "+ obj.age);
		System.out.println("My height is "+ obj.height);
		System.out.println("Am i married? "+ obj.isMarried);
		
		System.out.println("----Second package---");
		
		ThirdClass obj1 = new  ThirdClass();
		obj1.age = 20;
		obj1.height = 5.1f;
		obj1.isMarried = false;
		obj1.name = "Sumith";
		
		System.out.println("My name is "+ obj1.name);
		System.out.println("My age is "+ obj1.age);
		System.out.println("My height is "+ obj1.height);
		System.out.println("Am i married? "+ obj1.isMarried);
		
		ArithmeticOperations obj3=new ArithmeticOperations();
		System.out.println("i = "+obj3.i+" j = "+obj3.j);
		 System.out.println("Addition : " +(obj3.i+ obj3.j));
		 System.out.println("Substraction : " +(obj3.i - obj3.j));
		 System.out.println("Multiplication : " +(obj3.i * obj3.j));
		 System.out.println("Division : " +(obj3.i / obj3.j));
		 System.out.println("Modulus : " +(obj3.i % obj3.j));
*/		 
		
		ArithmeticOps obj = new ArithmeticOps();
		System.out.println("Addition : " + obj.addTwoNumbers(20, 10));
		System.out.println("Subtraction : " + obj.subTwoNumbers(20, 10));
		System.out.println("Multiplication : " + obj.mulTwoNumbers(20, 10));
		System.out.println("Division : " + obj.divTwoNumbers(20, 10));
		System.out.println("Power : " + obj.powTwoNumbers(2, 3));
		System.out.println("Remainder : " + obj.remTwoNumbers(20, 10));
	}

}
