package day08stringmanipulationsnt;

import java.util.Scanner;

public class String05 {

	public static void main(String[] args) {
		/*
		 Ask user to enter 3 Strings
		 Put them in ascending order according to their lengths
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first String");
		String s1 = scan.nextLine().trim();
		System.out.println("Enter second String");
		String s2 = scan.nextLine().trim();
		System.out.println("Enter third String");
		String s3 = scan.nextLine().trim();
		
		int a = s1.length();
		int b = s2.length();
		int c = s3.length();
		
		if(a>=b && b>=c) {
			System.out.println(s3 + " " + s2 + " " + s1);
		} else if(a>=c && c>=b) {
			System.out.println(s2 + " " + s3 + " " + s1);
		}else if(b>=a && a>=c) {
			System.out.println(s3 + " " + s1 + " " + s2);
		}else if(b>=c && c>=a) {
			System.out.println(s1 + " " + s3 + " " + s2);
		}else if(c>=a && a>=b) {
			System.out.println(s2 + " " + s1 + " " + s3);
		}else if(c>=b && b>=a) {
			System.out.println(s1 + " " + s2 + " " + s3);
		}
		
		scan.close();

	}

}
