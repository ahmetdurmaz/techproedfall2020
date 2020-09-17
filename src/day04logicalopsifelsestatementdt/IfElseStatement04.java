package day04logicalopsifelsestatementdt;

import java.util.Scanner;

public class IfElseStatement04 {

	public static void main(String[] args) {
		/*
		 Type java code by using if-else statement.
         A shop will give discount of 10% if the cost of purchased quantity is more than 1000.
         Ask user for quantity and the unit price then judge and print total cost for user. 
         If the quantity is less than 1000 output will be “No discount.”
         Note: For 10% discount, multiply the unit price by 0.9
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the unit price of the product");
		double unitPrice = scan.nextDouble();
		System.out.println("Enter the quantity you want to buy");
		int quantity = scan.nextInt();
		
		if(quantity > 1000) {
			System.out.println("Total price after discount: " + unitPrice*0.9*quantity);
		} else {
			System.out.println("Total price without discount: " + unitPrice*quantity);
		}
		
		scan.close();

	}

}
