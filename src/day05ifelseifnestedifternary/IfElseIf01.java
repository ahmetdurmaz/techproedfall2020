package day05ifelseifnestedifternary;

import java.util.Scanner;

public class IfElseIf01 {

	public static void main(String[] args) {
		
		/*
		 Use "if-else-if-statement", when you have more than 2 options
		*/
		
		/*
		 Ask user to enter 1 integer.
		 If the integer is more than 0, print "Positive" on the console
		 If the integer is 0, print "Neutral" on the console
		 If the integer is less than 0, print "Negative" on the console
		*/
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer to check its sign");
		int a = scan.nextInt();

		if(a > 0) {
			System.out.println("Positive");
		} else if(a == 0) {
			System.out.println("Neutral");
		} else {
			System.out.println("Negative");
		}
		
		scan.close();

	}

}
