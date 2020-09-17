package day03ifstatementdt;

import java.util.Scanner;

public class IfStatement02 {

	public static void main(String[] args) {
		/*
		  Ask user to enter the initial of a day in uppercase.
		  According to the initial which user entered, print the days of the week which start with the initial.
		  Example: S ==> Saturday, Sunday           T ==> Tuesday, Thursday        X ==> No available day
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the initial of a day in uppercase");
		//To get char from user you have to type the following code
		char initial = scan.next().charAt(0);
		
		if(initial=='S') {
			System.out.println("Saturday, Sunday");
		}
		if(initial=='W') {
			System.out.println("Wednesday");
		}
		if(initial=='T') {
			System.out.println("Tuesday, Thursday");
		}
		if(initial=='F') {
			System.out.println("Friday");
		}
		if(initial=='M') {
			System.out.println("Monday");
		}
		if(!(initial=='S') && !(initial=='W') && !(initial=='T') && !(initial=='F') && !(initial=='M')) {
			System.out.println("No available day");
		}	
		scan.close();
	}
}
