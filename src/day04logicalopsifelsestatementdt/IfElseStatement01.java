package day04logicalopsifelsestatementdt;

import java.util.Scanner;

public class IfElseStatement01 {

	public static void main(String[] args) {
		
		/*
		 Ask user to enter an integer.
		 Check if the integer is odd or even by using if-else statement
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer to check if it is odd or even");
		int num = scan.nextInt();
		
		//I used if-else: In if-else statement, there is just 1 condition so Java checks just 1 condition
		if(num % 2 == 0) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}
		
		//I used multiple if statement: In double if statement, there are 2 conditions so Java checks 2 conditions
		if(num % 2 == 0) {
			System.out.println("even");
		}
		if(num % 2 == 1) {
			System.out.println("odd");
		}
	
		scan.close();
	}
}
