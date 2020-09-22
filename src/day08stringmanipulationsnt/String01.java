package day08stringmanipulationsnt;

public class String01 {

	public static void main(String[] args) {
		
		//12.substring()
		String s1 = "Java is Java";
		System.out.println(s1.substring(3));//a is Java
		//Get just "Java" on the console
		System.out.println(s1.substring(8));//Java
		//Get just the last character
		System.out.println(s1.charAt(s1.length()-1));
		//If you use length as index in substring method, you will get nothing not error
		System.out.println(s1.substring(12));//nothing
		//If you use an indedx more than the length you will get Exception on the console.
		//System.out.println(s1.substring(15));		
		/*
		 Java has 2 main errors;
		 1)Compile Time Error: When you type code if you see red underline it is called
		                       Compile Time Error
		 2)Run Time Error: When you get red error messages on the console after running your code
		                   it is called Run Time Error                      
		 */		
		//Get all String by using substring()
		System.out.println(s1.substring(0));
		//substring(2, 9) ==> 2 is inclusive, 9 is exclusive
		System.out.println(s1.substring(2, 9));//va is J
		//Get "is" and print it on the console
		System.out.println(s1.substring(5, 7));//is
		//If you use same indexes for b eginning and ending indexes, you will get nothing
		System.out.println(s1.substring(5, 5));//nothing
		//In substring(), beginning index cannot be greater than ending index
		//System.out.println(s1.substring(8, 5));
		
		//13.toLowerCase() and 14.toUpperCase()
		String s2 = "TEACH and LEARN, that is the life";
		System.out.println(s2.toLowerCase());//teach and learn, that is the life
		System.out.println(s2.toUpperCase());//TEACH AND LEARN, THAT IS THE LIFE
		
		//Convert "life" to uppercase ==> TEACH and LEARN, that is the LIFE
		
		//Easy way:
		System.out.println(s2.replace("life", "LIFE"));//TEACH and LEARN, that is the LIFE
		
		//By using substring() and toUpperCase()
		System.out.println(s2.substring(0, 29) + s2.substring(29).toUpperCase());//TEACH and LEARN, that is the LIFE
		
		//15.trim()
		String s3 = "  John Mark   ";
		System.out.println(s3);//"  John Mark   "
		System.out.println(s3.trim());//"John Mark"

	}

}
