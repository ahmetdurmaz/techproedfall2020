package day05ifelseifnestedifternary;

import java.util.Scanner;

public class Ternary02 {

	public static void main(String[] args) {
		
		/*
		 Type java code by using ternary and if-else, ask user to enter an integer, 
		 If the integer is even, the output will be “The integer is even”. 
		 If the integer is odd, the output will be “The integer is odd”.
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer");
		int num = scan.nextInt();
		
		String result = num%2==0 ? "The integer is even" : "The integer is odd";
		System.out.println(result);
		
		System.out.println(num%2==0 ? "The integer is even" : "The integer is odd");
		
		scan.close();

	}

}
