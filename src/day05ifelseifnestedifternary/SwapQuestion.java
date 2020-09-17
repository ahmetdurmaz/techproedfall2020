package day05ifelseifnestedifternary;

import java.util.Scanner;

public class SwapQuestion {

	public static void main(String[] args) {
		/*
		 How to switch the values of 2 variables.
		 For eaxample; int a = 12 and int b = 13 ==> a = 13 and b = 12
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Give me 2 integers to swap");
		int a = scan.nextInt();
		int b = scan.nextInt();
		System.out.println("a: " + a );
		System.out.println("b: " + b);
		
		System.out.println("================");
		//1.Way: By using 3rd variable
		//1.Step:
		int temp = 0;
		temp = a;
		//2.Step
		a = b;
		//3.Step
		b = temp;
		System.out.println("a: " + a );
		System.out.println("b: " + b);
		
		System.out.println("================");
		//2.Way: Without using 3rd variable
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("a: " + a );
		System.out.println("b: " + b);
		
		scan.close();
	
	}

}
