package day09forwhileloops;

import java.util.Scanner;

public class String01 {

	public static void main(String[] args) {
		/*
		 Sometimes we need to update or remove just letters or just digits from a String.
		 To make it we use Regular Expressions (regex) with replaceAll() method
		*/	
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String");
		String s = scan.nextLine();
		
		//For letters and digits we use "\\w"
		//   "\\w" ==> It means A->Z, a->z, 0->9, _
		System.out.println(s.replaceAll("\\w", ""));
		//   "\\W" ==> It means different from A->Z, a->z, 0->9, _
		System.out.println(s.replaceAll("\\W", ""));
				
		//    "\\d" ==> It means 0->9
		System.out.println(s.replaceAll("\\d", "*"));
        //	    "\\D" ==> It means different from 0->9
		System.out.println(s.replaceAll("\\D", "-"));
		
		//    "\\s" ==> It means space
		System.out.println(s.replaceAll("\\s", "&"));
        //	    "\\S" ==> It means non-space
		System.out.println(s.replaceAll("\\S", "|"));
		
		/*
		 If you use regex , you have to use replaceAll(). 
		 replace() does not work with regex.
		*/
		
		scan.close();

	}

}
