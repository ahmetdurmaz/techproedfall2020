package day09forwhileloops;

import java.util.Scanner;

public class ForLoop06 {

	public static void main(String[] args) {
		/*
		 1)Ask user to enter a positive integer
		 2)Create and print the following image on the console
							       *
							      * *
							     * * *
							    * * * *
							       .
							       .
							       .
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer to create triangle");
		int n = scan.nextInt();
		
		for(int i=1; i<=n; i++) {
			for(int j=(n-i); j>0; j--) {
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++) {
				System.out.print("* ");
			}
			System.out.println();			
		}
		scan.close();
	}
}
