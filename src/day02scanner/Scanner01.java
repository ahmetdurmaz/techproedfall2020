package day02scanner;

import java.util.Scanner;

public class Scanner01 {

	public static void main(String[] args) {
		
		/*
		 In every application, we need to communicate with the user.
		 To communicate with the user we use Scanner Class.
		*/
		
		//1.Step
		Scanner scan = new Scanner(System.in);
		//2.Step
		System.out.println("Enter your age");
		//3.Step
		int age = scan.nextInt();
		System.out.println(age);
		
		scan.close();

	}

}
