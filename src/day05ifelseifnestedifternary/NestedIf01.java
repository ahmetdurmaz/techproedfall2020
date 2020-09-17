package day05ifelseifnestedifternary;

import java.util.Scanner;

public class NestedIf01 {

	public static void main(String[] args) {
		/*
		 Nested If: If you use "If Statement" inside an "If Statement" it is called "Nested If"
		*/
		
		/*
		 If the gender is "Male", then check the age 
		 if the age is less than 18 print "Boy" on the console
		 If the age is greater than or equal to 18 print "Man" on the console.
		 
		 If the gender is "Female", then check the age 
		 if the age is less than 18 print "Girl" on the console
		 If the age is greater than or equal to 18 print "Woman" on the console.
		 
		 For the other, print on the console "Not defined"
		*/		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your gender: Male / Female / Other");
		String gender = scan.next();		
		System.out.println("Enter your age");
		int age = scan.nextInt();
		
		if(gender.equalsIgnoreCase("Male")) {	
			if(age<0) {
				System.out.println("Enter a valid age");
			} else if(age<18) {
				System.out.println("Boy");
			} else {
				System.out.println("Man");
			}	
		} else if(gender.equalsIgnoreCase("Female")) {	
			if(age<0) {
				System.out.println("Enter a valid age");
			} else if(age<18) {
				System.out.println("Girl");
			} else {
				System.out.println("Woman");
			}	
		} else {
			System.out.println("Not defined");
		}
		
		scan.close();

	}

}
