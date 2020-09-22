package day09forwhileloops;

public class ForLoop01 {

	public static void main(String[] args) {
		
		//Print 6 times "Hello World!" on the console
		
		//Not recommended because there is repetation and repetation is not good practice in Coding
		//		System.out.println("Hello World!");
		//		System.out.println("Hello World!");
		//		System.out.println("Hello World!");
		//		System.out.println("Hello World!");
		//		System.out.println("Hello World!");
		//		System.out.println("Hello World!");
		
		//Use for loop to stop repetation
		for(int i = 1;  i<7;   i++) {
			System.out.println("Hello World!");
		}
		
		//Print the integers from 10 to 44 in the same line with a space between two numbers
		for(int i=10; i<45; i++) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		//Print the integers from 44 to 10 in the same line with a space between two numbers
		for(int i=44; i>9; i--) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		//Print the even integers from 44 to 10 in the same line with a space between two numbers
		for(int i=44; i>9; i--) {
			if(i%2==0) {
				System.out.print(i + " ");
			}
		}
		
		System.out.println();
		
		//Print the odd integers from 11 to 46 in the same line with a space between two numbers
		for(int i=11; i<47; i++) {
			if(i%2!=0) {
				System.out.print(i + " ");
			}
		}
		
		System.out.println();
		
		//Print all positive integers which are divisible by 6 and 8 and less than 500 
		//in the same line with a space between two numbers
		for(int i=1; i<500; i++) {
			if(i%6==0 && i%8==0) {
				System.out.print(i + " ");
			}
		}

	}

}
