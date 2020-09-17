package day03ifstatementnt;

import java.util.Scanner;

public class IfStatement01 {

	public static void main(String[] args) {
		
		// If it rains I will cancel the picnic
		if(5 > 3) {
			System.out.println("Good");
		}
		
		//Ask user to enter an integer.
		//If the integer is odd, print "Odd" on the console.
		//If the integer is even, print "Even" on the console.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer to check if it is odd or even");
		int num = scan.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("Even");
		}
		if(num % 2 == 1) {
			System.out.println("Odd");
		}
		
		//Ask user to enter the width and the length of a rectangle.
		//If the width and the length are equal to each other print "Square" on the console
		//If they are not equal to each other print "Rectangle" on the console.
		System.out.println("Enter the width of a rectangle");
		int width = scan.nextInt();
		System.out.println("Enter the length of a rectangle");
		int length = scan.nextInt();
		
		if(width == length) {
			System.out.println("Square");
		}
		if(width != length) {
			System.out.println("Rectangle");
		}
 		
		//Ask user to enter the initial of a day name in uppercase. Print the days on the console
		//if their initial is matching with user's.
		// S ==> Sunday, Saturday        F ==> Friday
		System.out.println("Enter the initial of any day in uppercase");
		//If you want to get a char from user use the following syntax
		char initial = scan.next().charAt(0);
		
		if(initial == 'S') {
			System.out.println("Saturday, Sunday");
		}
		if(initial == 'M') {
			System.out.println("Monday");
		}
		if(initial == 'T') {
			System.out.println("Tuesday, Thursday");
		}
		if(initial == 'W') {
			System.out.println("Wednesday");
		}
		if(initial == 'F') {
			System.out.println("Friday");
		}
		if(initial!='S' || initial!='M' || initial!='T' || initial!='W' || initial!='F') {
			System.out.println("I told you to enter initial, what are you doing?");
		}

	}

}
