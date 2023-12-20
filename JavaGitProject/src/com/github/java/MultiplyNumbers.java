package com.github.java;
import java.util.Scanner;
public class MultiplyNumbers {
        public static void getDivision(float c ,float d)
	{
		float div = c/d;
		System.out.println("Division is:"+div);
	}
	public static void main(String args[]) {

		int a = 15;
		int b = 6;
		int Result = a * b;
		System.out.println(Result);
		//Addinng the another functionality as division of numbers
	      Scanner sobj = new Scanner(System.in);
		System.out.println("Enter first number:");
			float c =sobj.nextFloat();
		System.out.println("Enter second number:");
			float d = sobj.nextFloat();
		getDivision(c,d);
	}
}
