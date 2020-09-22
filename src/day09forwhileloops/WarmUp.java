package day09forwhileloops;

import java.util.Scanner;

public class WarmUp {

	public static void main(String[] args) {
		/*
		 						Warm Up (10 Minutes)
		 1)Create a package and name it as "day09loops"
		 2)Create a class and name it as "WarmUp"
		 3)Ask user to enter a String
		 4)Remove all spaces from the String
		 5)Convert all letters to uppercase
		 6)If the number of characters different from space is 3 then check
		   if it is palindrome or not. If it is palindrome give a message like "Palindrome"
		   otherwise, "Not palindrome" 
		   (Palindrome: a word, phrase, or sequence that reads the same backward as forward.
		                For example; bob, madam, 123321, ...) 		                
		 7)If the number of characters different from space is not 3 then check if the first and the
		 last characters are same or not. If they are same give a message "Like a palindrome"
		 otherwise, "Not like a palindrome"              
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String");
		String s = scan.nextLine().replace(" ", "").toUpperCase();
		
		System.out.println(s);
		
		if(s.length()==3) {
			if(s.charAt(0)==s.charAt(2) && s.charAt(2) == s.charAt(0) ) {
				System.out.println("Palindrome");
			}else {
				System.out.println("Not palindrome");
			}
		} else {
			if(s.charAt(0)==s.charAt(s.length()-1)) {
				System.out.println("Like palindrome");
			}else {
				System.out.println("Not like palindrome");
			}
		}

		scan.close();
	}

}
