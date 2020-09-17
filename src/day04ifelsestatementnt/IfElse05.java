package day04ifelsestatementnt;

import java.util.Scanner;

public class IfElse05 {

	public static void main(String[] args) {
		/*
		 Type java code by using if-else statement.
         A shop will give discount of 10% if the purchased quantity is more than 1000.
         Ask user for quantity and unit price then judge and print total cost for user. 
         If the quantity is less than 1000 output will be “No discount.”
         Note: 10% discount ==> Multiply the unit price by 0.9
		*/
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the quantity you want to buy");
		int quantity = scan.nextInt();
		
		System.out.println("Enter the unit price");
		double price = scan.nextDouble();
		
		if(quantity > 1000) {
			System.out.println("Discounted price: " + price*0.9*quantity);
		}else {
			System.out.println("No discount: " + price*quantity);
		}
		
		scan.close();

	}

}
