package com.guvi.automation;

import java.util.Scanner;

public class ReverseStringClass {

	public static void main(String[] args) 
	{
		System.out.println("Program to Reverse the String");
		Scanner scn = new Scanner(System.in);
		String InputString = scn.nextLine();
		char[] stringArray = InputString.toUpperCase().toCharArray();
		char[] reverseStringArray=new char[stringArray.length];
		for(int i = 0,j=(stringArray.length-1);i<=stringArray.length&&j>0;i++,j--)
		{
			reverseStringArray[i]=stringArray[j];
		}
		String reverseString=new String(reverseStringArray);
		System.out.println(reverseString);
	}

}
