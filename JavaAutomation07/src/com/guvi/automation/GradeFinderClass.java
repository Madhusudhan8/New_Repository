package com.guvi.automation;

import java.util.Scanner;

public class GradeFinderClass {

	public static void main(String[] args) 
	{
		System.out.println("Enter the marks for which grade to be found");
		Scanner scan = new Scanner(System.in);
		outer:while(true)
		{
		
			int marks = scan.nextInt();
			{
			if(marks== 100)
				System.out.println("S Grade");
			else if(marks>=90&&marks<=99)
				System.out.println("A grade");
			else if(marks>=80&&marks<=89)
				System.out.println("B Grade");
			else if(marks>=70 && marks<=79)
				System.out.println("C Grade");
			else if(marks>=60 && marks<=69)
				System.out.println("D Grade");
			else if(marks>=50 && marks<=59)
				System.out.println("E Grade");
			else if(marks<50)
				System.out.println("F Grade");
			else if(marks>100)
			   break outer;
			
			}
			
		}
		
		

	}

}
