package day10dowhileloop;

public class DoWhile02 {

	public static void main(String[] args) {
		/*
		 Type a code by using do-while loop to print odd integers between 0 and 100 on the console
		*/
		int i = 0;
		
		do {
			if(i%2!=0) {
				System.out.print(i + " ");
			}	
			i++;
		}while(i<=100);
		
		System.out.println();
		
		/*
		 For the String "1234_?!abcdef", type a code to count the number of letters, 
		 the number of digits and the number of others by using do-while loop
		*/
		String s = "123456789_?!/abcdef";
		int k = 0;
		int letterCounter = 0;
		int digitCounter = 0;
		int figureCounter = 0;
		
		do {
			boolean isLetter = (s.charAt(k)>='a'&&s.charAt(k)<='z') || (s.charAt(k)>='A'&&s.charAt(k)<='Z');
			
			boolean isDigit = s.charAt(k)>='0'&&s.charAt(k)<='9';
			
			boolean isFigure = !isLetter && !isDigit;
			
			if(isLetter) {
				letterCounter++;
			}
			if(isDigit) {
				digitCounter++;
			}
			if(isFigure) {
				figureCounter++;
			}
			k++;
		}while(k<s.length());
		
		System.out.println("Letters: " + letterCounter);
		System.out.println("Digits: " + digitCounter);
		System.out.println("Figures: " + figureCounter);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
