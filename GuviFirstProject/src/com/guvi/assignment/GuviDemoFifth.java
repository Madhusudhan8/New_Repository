package com.guvi.assignment;

import java.util.Scanner;

public class GuviDemoFifth {

	public static void main(String[] args)
	{
		System.out.println("Enter the number to check if it is prime");
		int num;
		Scanner scan = new Scanner(System.in);
		num = scan.nextInt();
		L1: for(int x = num;x>0;x--)
		{
			if(x!=1)
			{
				if(x/num == 1)
				{
				continue L1;	
				}
				if(x/num != 1)
				{
				continue L1;
				}
			}
			else if(x == 1)
			{
				if(x/num == 1)	
				{
					System.out.println("Number is prime");
				}
			}
		}
		

	}

}
