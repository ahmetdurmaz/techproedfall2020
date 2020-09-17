package day02scanner;

import java.util.Scanner;

public class Scanner04 {

	public static void main(String[] args) {
		/*
		 Ask user to enter full name and address
		 Print them on the console
		*/

	    //To create an object follow the steps	
	   //Class Name	Object Name  Equal Sign   new Keyword      Constructor
		  Scanner      scan          =            new       Scanner(System.in);

		System.out.println("Enter your first and last name");
		String fullName = scan.nextLine();//For Strings we nextLine() method.
		                                  //There is one more method for Strings which is next()
		                                  //If you use next(), you can get just the first word in the String
			
		System.out.println("Enter your address");
		String address = scan.nextLine();
		
		System.out.println(fullName);
		System.out.println(address);
		
		scan.close();

	}

}
