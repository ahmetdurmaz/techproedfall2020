package day04ifelsestatementnt;

import java.util.Scanner;

public class IfElse02 {

	public static void main(String[] args) {
		/*
		 Ask user to enter his/her age. 
		 If the age is between 18 and 65 then output will be “You should work”, 
         else output will be “No need to work”
		*/
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your age");
		int age = scan.nextInt();
		
		//I will fix that code after learning if-else-if statement
		if(age>=18 && age<=65) {
			System.out.println("You should work");
		}else {
			System.out.println("No need to work");
		}

		scan.close();
	}

}
