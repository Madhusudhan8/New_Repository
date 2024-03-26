package com.guvi.assignment;

import java.util.Scanner;

public class GuviSecondDemo {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number to check if the number is even");
		int input = scan.nextInt();
		if(input%2 == 0)
		{
			System.out.println("Entered Number is a Even Number");
		}
		else
		{
			System.out.println("Entered Number is a Odd Number");
		}
	}

}
