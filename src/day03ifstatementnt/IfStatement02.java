package day03ifstatementnt;

public class IfStatement02 {

	public static void main(String[] args) {
		
		/*
		 Logical Operators:
		 1) && ==> And Operator:
							    true && false = false
							    false && true = false
							    false && false = false
							    true && true = true
		    
		2) || ==> Or Operator  
							   true || true = true
							   true || false = true
							   false || true = true
							   false || false = false
							   
		3) ! ==> Not Operator	
		                       !true = false
		                       !false = true
		                       !!true = true	
		                       
		Detail Information: Normally And Operator is  &, but if you type && your code will run faster 
		                    For "false && true = false"  and  "false && false = false" no need to check the 
		                    second condition. If you use &&, Java will not check the second condition. But
		                    if you use &, Java checks both sides for all.                			   
		*/
		
		if(9>7 && 8<9) {
			System.out.println("Good");
		}
		
		if(15>7 || 3>1) {
			System.out.println("Bad");
		}

	}

}
