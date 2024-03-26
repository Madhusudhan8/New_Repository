package com.guvi.assignment;

import java.util.Scanner;

public class GuviFirstDemo {

	public static void main(String[] args) 
	{
		int a,b,c,d;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value for variable a");
		a = scan.nextInt();
		System.out.println("Enter the value for variable b");
		b = scan.nextInt();
		System.out.println("Enter the value for variable c");
		c = scan.nextInt();
		System.out.println("Enter the value for variable d");
		d = scan.nextInt();
		
		if((a + b)>(c + d))
		{
			System.out.println("Sum of a and b is greater than c and d");
		}
		else
		{
			System.out.println("Sum of c and d is greater than a and b");
		}

	}

}
