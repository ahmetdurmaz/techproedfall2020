package day02scanner;

import java.util.Scanner;

public class Scanner02 {

	public static void main(String[] args) {
		
		//Please type the code to get the width and the length of a rectangle from user
		//then calculate the perimeter and area of the rectangle
		
		//1.Step
		Scanner scan = new Scanner(System.in);
		//2.Step
		System.out.println("Enter the width of the rectangle");
		//3.Step
		double width = scan.nextDouble();
		
		System.out.println("Enter the length of the rectangle");
		double length = scan.nextDouble();
		
		//1. way to print the result on the console (Not recommended)
		System.out.println("Perimeter: " + (2*width + 2*length)); //perimeter
		System.out.println("Area: " + (width*length));//Area
		
		//2. way to print the result on the console(Recommended)
		double perimeter = 2*width + 2*length;
		System.out.println("Perimeter: " + perimeter);
		double area = width*length;
		System.out.println("Area: " + area);
		
		scan.close();
	}

}
