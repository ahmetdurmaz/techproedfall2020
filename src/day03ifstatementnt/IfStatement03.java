package day03ifstatementnt;

import java.util.Scanner;

public class IfStatement03 {

	public static void main(String[] args) {
		/*
		 Type java code by using if statement. 
		 When you enter the name of the day of a week, 
         output will be “Weekday” or “Weekend day” according to the name of the day.
		*/

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the name of any day in lowercase");
		String day = scan.nextLine();
		
		//For Strings DO NOT use "==" to check equality. 
		//We use "==" for primitive data types but String is non-primitive
		//For Strings we use equals()
		if(day.equals("sunday") || day.equals("saturday")) {
			System.out.println("Weekend day");
		}
		if(day.equals("monday") || day.equals("tuesday") || day.equals("wednesday") || day.equals("thursday") || day.equals("friday")) {
			System.out.println("Weekday");
		}

	}

}
