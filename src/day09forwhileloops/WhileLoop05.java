package day09forwhileloops;

import java.util.Scanner;

public class WhileLoop05 {

	public static void main(String[] args) {
		/*
		 Type java code by using while loop, 
         Write a program to count the factors of an integer which is entered by user.
         Factors of 12 = 1, 2, 3, 4, 6, 12
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer to find its factors");
		int n = scan.nextInt();
		
		if(n<0) {
			n = -n;
		}
		
		int i = 1;
		
		while(i<=n) {
			
			if(n%i==0) {
				System.out.print(i + " ");
			}
			
		  i++;
		}
		
		scan.close();

	}

}
