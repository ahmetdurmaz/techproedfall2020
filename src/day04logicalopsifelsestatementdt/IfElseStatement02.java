package day04logicalopsifelsestatementdt;

import java.util.Scanner;

public class IfElseStatement02 {

	public static void main(String[] args) {
		/*
		 Type java code by using if-else statement, 
         if the password is “JavaLearner”, output will be “The password is true”. 
         Otherwise, output will be “The password is false”.
		*/
		
		/*
		 "==" can be used for primitive data types. If you use it for non-primitive ones
		 sometimes it gives correct result sometimes it gives wrong result.
		 Because of that we do not use "==" for Strings, we use "equals()" method.
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the password");
		String password = scan.nextLine();
		
		if(password.equals("JavaLearner")) {
			System.out.println("The password is true");
		} else {
			System.out.println("The password is false");
		}
		
		scan.close();

	}

}
