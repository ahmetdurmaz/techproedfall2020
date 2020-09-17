package day03ifstatementnt;

import java.util.Scanner;

public class Modulus {

	public static void main(String[] args) {
		
		/*
		 Modulus: Modulus returns the remainder in division operation
		          Modulus operator sign is %
		*/
		
		int a = 13;
		int b = 5;
		System.out.println(a % b);//3
		
		//Ask user to enter 2 integers. Print the reminder on the console if you divide
		//the integer by the second.
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 2 integers:");
		int c = scan.nextInt();
		int d = scan.nextInt();
		System.out.println("Remainder: " + c % d);
		
		//Ask user to enter an integer and check if it is "odd" or "even"
		//Note:When you divide an integer by 2, if the remainder is 1 then the integer is odd.
		//     When you divide an integer by 2, if the remainder is 0 then the integer is even.
		System.out.println("Enter an integer");
		int e = scan.nextInt();
		
		System.out.println("If the remainder is 0 the integer is even otherwise ir is odd: " + e % 2);

		scan.close();

	}

}
