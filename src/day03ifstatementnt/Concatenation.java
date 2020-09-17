package day03ifstatementnt;

public class Concatenation {

	public static void main(String[] args) {
		
		/*
		 Concatenation: It joins two or more Strings
		*/
		
		String s = "Java";
		String t = "is easy";
		System.out.println(s + " " + t);//Java is easy
		
		int a = 2;
		int b = 3;
		String c = "A";
		System.out.println(c + a + b);
		System.out.println(c + (a + b));
		System.out.println(a + c + b);
		System.out.println(a + b + c);
		
		int d = 2;
		int e = 3;
		String f = "Java";
		//By using d, e, and f, print 61Java-1 on the console
        System.out.println((d*e) + ((e-d) + f) + (d-e));//61Java-1
        System.out.println((e*e*e*d+e+d+d)+ f +(d-e));//61Java-1

	}

}
