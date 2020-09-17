package day04ifelsestatementnt;

import java.util.Scanner;

public class IfElse01 {

	public static void main(String[] args) {
		
		/*
		 If it rains I will cancel the picnic else I will not
		*/
		
		/*
		 Ask user to enter an integer.
		 If the integer is even print "Even" on the console.
		 If the integer is odd print "Odd" on the console.
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer");
		int num = scan.nextInt();
		
		//1.way by using if-else statement
		if(num % 2 == 0) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}
		
		//2.way by using if statement
		if (num%2==0) {
			 System.out.println("Even");
		}
		if(num%2!=0){
			 System.out.println("Odd");
		}

		scan.close();
	}

}
