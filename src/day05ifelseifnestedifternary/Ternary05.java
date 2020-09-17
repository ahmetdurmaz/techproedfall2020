package day05ifelseifnestedifternary;

import java.util.Scanner;

public class Ternary05 {

	public static void main(String[] args) {
		/*
		 Type java code by using ternary.
         Write a program to print absolute value of an integer entered by user. 
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer");
		int n = scan.nextInt();
		
		int result = n>=0 ? n : -1*n;
		System.out.println(result);
		
		scan.close();

	}

}
