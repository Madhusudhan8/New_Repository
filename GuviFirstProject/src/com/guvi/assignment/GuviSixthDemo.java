package com.guvi.assignment;

import java.util.Scanner;

public class GuviSixthDemo
{

	public static void main(String[] args) 
	{
		System.out.println("Enter the number for which factorial is to be found");
		Scanner scan = new Scanner(System.in);
		long num = scan.nextLong();
		GuviSixthDemo.factorial(num,1);
		

	}
	public static void factorial(long num,long y)
	{
		
		for(;num>0;num--)
		{
			y = y*num;
			
		}
		System.out.println("Factorial of number is " + y);
		
		
	}

}
