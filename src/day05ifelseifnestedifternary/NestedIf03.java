package day05ifelseifnestedifternary;

import java.util.Scanner;

public class NestedIf03 {

	public static void main(String[] args) {
		
		/*
		 Type java code by using nested if() statement.
         Ask user to enter a password
          
         If the initial of the password is uppercase then check if it is ‘A’ or not. 
         If it is ‘A’ the output will be “Valid Password” 
         Otherwise; the output will be “Invalid Password”
         
         If the initial of the password is lowercase then check if it is ‘z’ or not. 
         If it is ‘z’ the output will be “Valid Password” 
         Otherwise; the output will be “Invalid Password” 
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter password");
		String pwd = scan.nextLine();
		
		char initial = pwd.charAt(0);
		
		if(initial>='A' && initial<='Z') {
			
			if(initial=='A') {
				System.out.println("Valid Password");
			} else {
				System.out.println("Invalid password");
			}
			
		} else if(initial>='a' && initial<='z') {
			
			if(initial=='z') {
				System.out.println("Valid password");
			}else {
				System.out.println("Invalid password");
			}
			
		} else {
			
			System.out.println("You have to use just letters at the beginning");
		}
		
		scan.close();

	}

}
