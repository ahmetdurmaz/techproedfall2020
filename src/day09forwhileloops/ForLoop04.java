package day09forwhileloops;

import java.util.Scanner;

public class ForLoop04 {

	public static void main(String[] args) {
		/*
		 1)Ask user to enter beginning and ending integers
		 2)Add all integers from the beginning to ending integer
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter beginning integer");
		int b = scan.nextInt();
		System.out.println("Enter ending integer");
		int e = scan.nextInt();
		
		int sum = 0;
		
		if(b>e) {
			System.out.println("Beginning integer must be less than or equal to ending integer");
		} else {
			
			for(int i=b; i<=e;       i++) {	
				sum = sum + i;
			}
            //If you want to see final result put System.out.println(sum); out of the loop
			System.out.println(sum);
		}	
		
		scan.close();
	}

}
