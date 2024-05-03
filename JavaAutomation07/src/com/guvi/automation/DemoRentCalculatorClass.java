package com.guvi.automation;

import java.util.Scanner;

public class DemoRentCalculatorClass {

	public static void main(String[] args)
	{
		System.out.println("Enter the number of the month");
		Scanner scan = new Scanner(System.in);
		int numberOfMonth = scan.nextInt();
		System.out.println("Enter the Rent per day");
		float rentPerDay = scan.nextFloat();
		System.out.println("Enter the Number of days Stayed");
		int numberOfDaysStayed = scan.nextInt();
		
		switch(numberOfMonth)
		{
			case 1:Other(numberOfMonth, rentPerDay, numberOfDaysStayed); break;
			case 2:Other(numberOfMonth, rentPerDay, numberOfDaysStayed); break;
			case 3:Other(numberOfMonth, rentPerDay, numberOfDaysStayed);break;
			case 4:AprToJune(numberOfMonth, rentPerDay, numberOfDaysStayed); break;
			case 5:AprToJune(numberOfMonth, rentPerDay, numberOfDaysStayed); break;
			case 6:AprToJune(numberOfMonth, rentPerDay, numberOfDaysStayed); break;
			case 7:Other(numberOfMonth, rentPerDay, numberOfDaysStayed); break;
			case 8:Other(numberOfMonth, rentPerDay, numberOfDaysStayed); break;
			case 9:Other(numberOfMonth, rentPerDay, numberOfDaysStayed); break;
			case 10:Other(numberOfMonth, rentPerDay, numberOfDaysStayed); break;
			case 11:NovToDec(numberOfMonth, rentPerDay, numberOfDaysStayed); break;
			case 12: NovToDec(numberOfMonth, rentPerDay, numberOfDaysStayed);break;
			default: System.out.println("Invalid Month");
			
		}
	}
	public static void AprToJune(int numberOfMonth,float rentPerDay,int numberOfDaysStayed)
	{
		float rentPerDays = (((rentPerDay*20)/100)+rentPerDay);
		float rent = rentPerDays*numberOfDaysStayed;
		System.out.println("Rent of Room is "+ rent);
	}
	public static void NovToDec(int numberOfMonth,float rentPerDay,int numberOfDaysStayed)
	{
		float rentPerDays = (((rentPerDay*20)/100)+rentPerDay);
		float rent = rentPerDays*numberOfDaysStayed;
		System.out.println("Rent of Room is "+ rent);
		
	}
	public static void Other(int numberOfMonth,float rentPerDay,int numberOfDaysStayed)
	{
		float rent = rentPerDay*numberOfDaysStayed;
		System.out.println("Rent of Room is "+ rent);
	}

}
