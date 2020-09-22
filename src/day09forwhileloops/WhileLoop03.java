package day09forwhileloops;

import java.util.Scanner;

public class WhileLoop03 {

	public static void main(String[] args) {
		/*
		 Type java code by using while loop, 
         Write a program that prompts the user to input a positive integer. 
         It should then print factorial of that number. 
		*/

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer to calculate its factorial");
		int n = scan.nextInt();
		
		int result = 1;
		
		int i=1;		
		while(i<=n) {
			result = result * i;
			i++;
		}		
		System.out.println(n + "!= " + result);		
		scan.close();
	}
}
