package day09forwhileloops;

public class WhileLoop01 {

	public static void main(String[] args) {
		
		//Print the integers from 5 to 11 on the console in the same line withe a space between 2 numbers
		
		for(int i=5; i<=11; i++) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		int i=5;
		while(i<=11) {
			System.out.print(i + " ");
			i++;
		}

	}

}
