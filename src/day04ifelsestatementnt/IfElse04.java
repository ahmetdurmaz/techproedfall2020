package day04ifelsestatementnt;

import java.util.Scanner;

public class IfElse04 {

	public static void main(String[] args) {
		/*
		 Ask user ta enter any name of the days, then get second ,fourth, 
         and sixth letter of the day name and print them on the console, 
         in the same line.
         For example; if the user enters “Monday” output will be “ody”
		*/
		//To get a specific character from a String use the following code
		String s = "Learn Java";
		System.out.println(s.charAt(3));//r
		System.out.println(s.charAt(6));//J
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a day name");
		String day = scan.next();
		
		day = day.toLowerCase();
		
		if(day.equals("monday") || day.equals("tuesday") || day.equals("wednesday")
		   || day.equals("thursday") || day.equals("friday") || day.equals("saturday")
		   || day.equals("sunday")) {
			
			System.out.print(day.charAt(1));
			System.out.print(day.charAt(3));
			System.out.print(day.charAt(5));
			
		} else {
			System.out.println("Enter a valid day name");
		}
		
		scan.close();

	}

}
