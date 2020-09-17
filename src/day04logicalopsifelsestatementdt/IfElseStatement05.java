package day04logicalopsifelsestatementdt;

import java.util.Scanner;

public class IfElseStatement05 {

	public static void main(String[] args) {
		/*
		 How to get a specific character from a String
		 "Suleyman" ==> How to get 3rd character or 5th character
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String");
		String s = scan.nextLine();
		
		System.out.println("Enter the number of the character you want to see on the console");
		int numOfChar = scan.nextInt();
		
		if(numOfChar <= s.length() && numOfChar>0) {
			System.out.println(s.charAt(numOfChar-1));
		}else {
			System.out.println("Enter a valid number of character");
		}
		scan.close();
	}
}
