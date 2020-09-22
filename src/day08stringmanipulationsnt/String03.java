package day08stringmanipulationsnt;

import java.util.Scanner;

public class String03 {

	public static void main(String[] args) {
		/*
			Ask user to enter a password
			1)Remove all spaces from the beginning and ending of password
			2)Make the first character uppercase 'A' 
			3)Make the last 2 characters "**"
			4)The password must have at least 6 characters
			5)Then give the password to the user
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your password");
		String pwd = scan.nextLine().trim();	
		
		if(pwd.length()<6) {
			System.out.println("Please enter at least 6 characters");
		} else {
			//In replace method you can use charAt() or substring() instead of a specific character
			//pwd = pwd.replace(pwd.charAt(0), 'A');
            //pwd = pwd.replace(pwd.substring(pwd.length()-2), "**");
			
			pwd = "A" + pwd;
			pwd=pwd.substring(0, pwd.length()-2)+"**";
			
			System.out.println(pwd);
			
		}
		
		scan.close();

	}

}
