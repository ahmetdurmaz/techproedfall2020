package day05ifelseifnestedifternary;

import java.util.Scanner;

public class NestedIf04 {

	public static void main(String[] args) {
		/*
		 Type java code by using nested if() statement.
         Write a program to check if a year is leap year or not.
         If the year is divisible by 100 then it must be divisible by 400.
         If a year is not divisible by 100 then it must be divisible by 4.
		*/
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter year");
		int year = scan.nextInt();

		if(year<0) {
			System.out.println("Enter a valid year");
		} else if(year%100==0) {
			if(year%400==0) {
				System.out.println("Leap year");
			} else {
				System.out.println("Not leap year");
			}
		} else {
			if(year%4==0) {
				System.out.println("Leap year");
			} else {
				System.out.println("Not leap year");
			}	
		}
		
		scan.close();

	}

}
