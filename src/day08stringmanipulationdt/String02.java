package day08stringmanipulationdt;

import java.util.Scanner;

public class String02 {

	public static void main(String[] args) {
		/*
		 Ask user ta enter his/her first name, last name and Social Security Number. 
         Then type a program which makes 
         the initials of the first name and the last name in uppercase, other characters will be in lowercase.
         All characters except last 4 characters of the Social Security Number “*”
                          For example; Suleyman Alptekin *****5678 (9 digits)
		*/	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your firstname");
		String fn = scan.nextLine();
		
		System.out.println("Enter your lastname");
		String ln = scan.nextLine();
		
		System.out.println("Enter your SSN");
		String ssn = scan.nextLine();
		
		System.out.print(fn.trim().substring(0, 1).toUpperCase() + fn.trim().substring(1).toLowerCase() + " ");
		System.out.print(ln.trim().substring(0, 1).toUpperCase() + ln.trim().substring(1).toLowerCase() + " ");
		
		System.out.println("*****" + ssn.trim().substring(ssn.trim().length()-4));
		
		scan.close();
	}
}
