package com.guvi.assignment;

import java.util.Scanner;

public class GuviNinthDemo {

	public static void main(String[] args) 
	{
		System.out.println("Enter the age of the person");
		Scanner scan = new Scanner(System.in);
		int age = scan.nextInt();
		if(age>64)
		{
			System.out.println("Person is a senior citizen");
		}
		else if(age<65)
		{
			System.out.println("Person is not a senior citizen");
		}
		

	}

}
