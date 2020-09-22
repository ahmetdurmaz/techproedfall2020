package day09forwhileloops;

import java.util.Scanner;

public class ForLoop05 {

	public static void main(String[] args) {
		/*
		 1)Ask user to enter a positive integer
		 2)Claculate and print the factorial of the integer
		     5 factorial(5!) = 1*2*3*4*5 = 120
		     3! = 1*2*3
		*/		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a positive integer to calculate its factorial");
		int n = scan.nextInt();
		
		int result = 1;
		
		if(n<0) {
			System.out.println("Factorial does not work with negative numbers");
		}else if(n==0) {
			System.out.println(n + "!= 1");
		}else {
			for(int i=1; i<=n; i++) {
				result = result * i;
			}
			System.out.println(n + "!= " + result);
		}
		
		scan.close();

	}

}
