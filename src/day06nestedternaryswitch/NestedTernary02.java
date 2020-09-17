package day06nestedternaryswitch;

import java.util.Scanner;

public class NestedTernary02 {

	public static void main(String[] args) {
		/*
		 Ask user the password.
		 
		 If the password has 8 characters and the first character is a digit
		 print "The password is valid"
		 
		 Otherwise, check the last character of the password
		 If it is 'Z' print "Not secure but acceptable"
		 Otherwise, print "The password is not valid"
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your password");
		String pwd = scan.nextLine();
		
	    String result = pwd.length()==8 && pwd.charAt(0)>='0' && pwd.charAt(0)<='9' ? "The password is valid" : 
	    	            pwd.charAt(pwd.length()-1)=='Z' ? "Not secure but acceptable" : "The password is not valid";
	    System.out.println(result);

	}

}
