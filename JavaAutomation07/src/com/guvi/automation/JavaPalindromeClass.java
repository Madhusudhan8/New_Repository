package com.guvi.automation;

import java.util.Scanner;

public class JavaPalindromeClass {

	public static void main(String[] args)
	{
		System.out.println("Program to check whether palindrome or not");
		Scanner scn = new Scanner(System.in);
		String palindromeString = scn.nextLine();
		char[] palindromeArray = palindromeString.toUpperCase().toCharArray();
		if(palindromeArray.length%2==0)
		{
		for(int i=(palindromeArray.length-1), j = 0;i>=0 && j<=palindromeArray.length/2;i--,j++)	
		{
				if(palindromeArray[i]==palindromeArray[j])
				{
					
					if(j==palindromeArray.length/2)
					{
						System.out.println("Palindrome");
						
					}
					else
					{
						continue;
					}
					
				}
				else
				{
					System.out.println("Not a Palindrome");
					break;
				}
		}
		}
		if(palindromeArray.length%2==1)
		{
		for(int i=(palindromeArray.length-1), j = 0;i>=0 && j<=Math.ceil(palindromeArray.length/2);i--,j++)	
		{
				if(palindromeArray[i]==palindromeArray[j])
				{

					if(j==Math.ceil(palindromeArray.length/2))
					{
						System.out.println("Palindrome");
						
					}
					else
					{
						continue;
					}
					
				}
				else
				{
					System.out.println("Not a Palindrome");
					break;
				}
		}
		}
		
		
	}

}
