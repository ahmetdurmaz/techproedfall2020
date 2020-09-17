package day02scanner;

public class Wrapper {

	public static void main(String[] args) {
		
		/*
		 1)Wrapper Class contains primitive value and some methods which can be used by primitives
		 2)How to name Wrapper Classes
		    **** int ==> Integer
		    byte ==> Byte
		    short ==> Short
		    long ==> Long
		    float ==> Float
		    double ==> Double
		    **** char ==> Character
		    boolean ==> Boolean		    
		*/
		
		//What is the maximum value of byte data type?
		byte maxValueByte = Byte.MAX_VALUE;
		System.out.println(maxValueByte);//127		
		//What is the minimum value of byte data type?
		byte minValueByte = Byte.MIN_VALUE;
		System.out.println(minValueByte);//-128
		
		//What is the minimum and maximum value of short data type?
		short maxValueShort = Short.MAX_VALUE;
		System.out.println(maxValueShort);
		short minValueShort = Short.MIN_VALUE;
		System.out.println(minValueShort);
		
		//Homework: Find the max and min values of int, long, float, double

	}

}
