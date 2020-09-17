package day04logicalopsifelsestatementdt;

public class LogicalOps {

	public static void main(String[] args) {
		
		/*
		 Logical Operators:
		 1) And Operation: We use && for And Operations.
		                   Before and After &&, you should have boolean values
		                  
			                  true && false = false
			                  false && true = false
			                  false && false = false
			                  true && true = true
		                  
		                   If you want to get true from && operation both must be true.
		                   
		 2) Or Operation: We use ||  for Or Operations.
		                  Before and After ||, you should have boolean values.
		                  
		                  true || false = true
		                  false || true = true
		                  true || true = true
		                  false || false = false                 
		                  
		                  If you want to get false from || operation both must be false.
		                  
		 3) Not Operation: We use ! for Not Operations 
		                   
		                   !true = false 
		                   !false = true
		                   !!true == true
		                   !(3<2) == true               
		 */
		
		if(5>3 && 4<7) {
			System.out.println("Good for And");
		}
		
		if('A'=='a' || 5<7) {
			System.out.println("Good for Or");
		}
		
		if(!(3<2)) {
			System.out.println("Good for Not");
		}

	}

}
