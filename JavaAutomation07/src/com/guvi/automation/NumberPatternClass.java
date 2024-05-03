package com.guvi.automation;

import java.util.Scanner;

public class NumberPatternClass {

	public static void main(String[] args) 
	{
		int output = 1;
		System.out.println("Enter the number for the pattern");
		Scanner scan =  new Scanner(System.in);
		int inputValue=scan.nextInt();
		for(int i=1;i<inputValue;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(output++ +" ");
			}
			System.out.println();
		}

	}

}
