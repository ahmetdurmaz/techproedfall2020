package day05ifelseifnestedifternary;

import java.util.Scanner;

public class IfElseIf03 {

	public static void main(String[] args) {
		/*
		 Type java code by using if-else if() statement.
         A school has following rules for grading system:
         1. Below 50 - D     2. 50 to 59 - C       3. 60 to 79 - B.     4. From 80 to 100 - A 
         Ask user to enter marks and print the corresponding grade.
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your grade");
		int grade = scan.nextInt();
		
		if(grade<0) {
			System.out.println("Enter a valid grade");
		} else if(grade<50) {
			System.out.println("D");
		} else if(grade<60) {
			System.out.println("C");
		} else if(grade<80) {
			System.out.println("B");
		} else if(grade<=100) {
			System.out.println("A");
		} else {
			System.out.println("Enter a valid grade");
		}
		
		scan.close();

	}

}
