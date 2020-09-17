package day04logicalopsifelsestatementdt;

import java.util.Scanner;

public class IfElseStatement03 {

	public static void main(String[] args) {
		/*
		 Type java code by using if-else statement, 
         Write a program to print absolute value of a number entered by user.
         Absolute Value: If the number is positive or zero return the number itself
                         If the number is negative return the number after multiplying by -1
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to find its absolute value");
		double num = scan.nextDouble();
		
		if(num>=0) {
			System.out.println("Absolute value: " + num);
		} else {
			System.out.println("Absolute value: " + (-1*num));
		}
		
		scan.close();

	}

}
