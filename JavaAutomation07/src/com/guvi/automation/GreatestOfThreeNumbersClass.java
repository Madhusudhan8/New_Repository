package com.guvi.automation;

import java.util.Scanner;

public class GreatestOfThreeNumbersClass {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the 3 numbers to compare");
		int firstNumber = scan.nextInt();
		int secondNumber = scan.nextInt();
		int thirdNumber = scan.nextInt();
		
		if(firstNumber>secondNumber && firstNumber>thirdNumber)
		{
			System.out.println("First Number is Greatest");
		}
		else if(secondNumber>firstNumber&&secondNumber>thirdNumber)
		{
			System.out.println("Second Number is greatest");
		}
		else if(thirdNumber>firstNumber&&thirdNumber>secondNumber)
		{
			System.out.println("Third Number is greatest");
		}
		else
		{
			System.out.println("All are equal");
		}
	}

}
