package day05ifelseifnestedifternary;

import java.util.Scanner;

public class Ternary01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer");
		int num = scan.nextInt();
		
		//If-Else Statement
		if(num%2==0) {System.out.println("Even");} else { System.out.println("Odd");}
		
		//Ternary
				         // Condition    QuestionMark    CodeForTrueCondition    Colon     CodeForFalseCondition
		String	result =	num%2==0          ?                 "Even"             :               "Odd";
		System.out.println("Ternary: " + result);
		
		//If the data types for true and false conditions are different do not create result variable
		//Put the ternary into System.out.println() directly
		System.out.println(num>0 ? "Positive" : -1);
		
		scan.close();
	}

}
