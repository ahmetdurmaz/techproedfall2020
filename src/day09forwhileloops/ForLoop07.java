package day09forwhileloops;

import java.util.Scanner;

public class ForLoop07 {

	public static void main(String[] args) {
		/*
		 Create the following image by getting the number of rows from user
		 				 .
		                 .
		              * * * *
		               * * *
		                * *
		                 * 
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer to create triangle");
		int n = scan.nextInt();

		for(int i=n; i>0; i--) {
			for(int j=0; j<n-i; j++) {
				System.out.print(" ");
			}
			for(int k=n; k>n-i; k--) {
				System.out.print("* ");
			}
			System.out.println();	
		}
		
		scan.close();

	}

}
