package com.guvi.assignment;

import java.util.Scanner;

public class GuviFourthDemo {

	public static void main(String[] args)
	{
		int x,y;
		int q[] = new int[2];
		Scanner scan = new Scanner(System.in);
		x = q[0] = scan.nextInt();
		y = q[1] = scan.nextInt();
		//Swapping using value
		System.out.println("Values of variables before swapping using value outside the function " + x + " "+y);
		GuviFourthDemo.swapUsingValue(x,y);
		System.out.println("Values of variables after swapping using value outside the function " + x + " "+y);
		//Swapping using reference
		System.out.println("Values of variables after swapping using array outside the function " + q[0] + " "+q[1]);
		GuviFourthDemo.swapUsingReference(q);
		System.out.println("Values of variables after swapping using array outside the function " + q[0] + " "+q[1]);
	}
	public static void swapUsingValue(int a, int b)
	{
		int w;
		w = a;
		a = b;
		b = w;
		System.out.println("Values of variables after swapping using value inside the function " + a + " "+b);
	}
	public static void swapUsingReference(int[]a)
	{
		int z;
		z = a[0];
		a[0] = a[1];
		a[1] = z;
		System.out.println("Values of variables after swapping using array inside the function " + a[0] + " "+a[1]);
		
	}
	
	
}
