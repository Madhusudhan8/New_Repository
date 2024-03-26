package com.guvi.assignment;

import java.util.Scanner;

public class GuviSeventhDemo {

	public static void main(String[] args)
	{
		System.out.println("Enter the string for which the length should be found");
		Scanner scan = new Scanner(System.in);
		String test = scan.nextLine();
		System.out.println("Length of the string is " + test.length());

	}

}
