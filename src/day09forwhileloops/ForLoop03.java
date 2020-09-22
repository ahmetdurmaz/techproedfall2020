package day09forwhileloops;

import java.util.Scanner;

public class ForLoop03 {

	public static void main(String[] args) {
		/*
		 1)Ask user to enter a String
		 2)Check the String if it is "Palindrome" or not
		*/
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String");
		String s = scan.nextLine();
		
		String r = "";
		
		for(int i = s.length()-1; i>=0;    i--) {	
			r = r + s.charAt(i);
		}
		System.out.println(r);
		
		if(s.equalsIgnoreCase(r)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not palindrome");
		}
		
		scan.close();

	}

}
