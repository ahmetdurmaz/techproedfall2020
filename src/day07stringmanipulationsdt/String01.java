package day07stringmanipulationsdt;

public class String01 {

	public static void main(String[] args) {
		
		/*
		 There are many String Methods in String Class to manipulate Strings
		*/
		
		String s1 = "Java";
		String s2 = "is easy";
		
		//1.charAt()
		System.out.println(s1.charAt(0));//Returns the 1st character
		System.out.println(s1.charAt(2));//Returns the 3rd character	
		//For the last character everytime use length()-1 to make your code dynamic
		System.out.println(s1.charAt(s1.length()-1));//Returns the last character
		
		System.out.println("==============");
		
		//2.concat()
		System.out.println(s2.concat(s1));//is easyJava
		System.out.println(s2 + s1);//is easyJava
			
		System.out.println("==============");
		
		//3.contains()
		System.out.println(s2.contains("easy"));//true
		System.out.println(s2.contains("a"));//true
		System.out.println(s2.contains("IS"));//false
		System.out.println(s2.contains(" "));//true
		System.out.println(s2.contains(""));//true
		
		//4.endsWith()
		System.out.println(s2.endsWith("y"));//true
		System.out.println(s2.endsWith("m"));//false
		System.out.println(s2.endsWith(""));//true
		
		//5.equals()
		System.out.println(s2.equals(s1));//false
		System.out.println(s1.equals("Java"));//true
		System.out.println(s1.equals(s1));//true
		System.out.println(s1.equals("JAVA"));//false
		
		//6.equalsIgnoreCase()
		System.out.println(s1.equalsIgnoreCase("JAVA"));//true
		
		//7.indexOf() method returns the index of first occurence of a specific character          
		System.out.println(s1.indexOf('a'));//1
		String s3 = "Java is easy and easy";
		System.out.println(s3.indexOf('s'));//6
		System.out.println(s3.indexOf("easy"));//8
		System.out.println(s3.indexOf('a', 5));//9
		System.out.println(s3.indexOf("easy", 9));//17
		//If the character does not exist in String indexOf() returns -1
		System.out.println(s3.indexOf('x'));//-1
		System.out.println(s3.indexOf(' '));//4
		System.out.println(s3.indexOf(""));//0
		System.out.println(s3.indexOf("", 3));
		
		//8.isEmpty()
		String s4 = "Study hard study hard";
		String s5 = "";
		System.out.println(s4.isEmpty());//false
		System.out.println(s5.isEmpty());//true
		
		//9.
		System.out.println(s4.lastIndexOf('u'));//13
		System.out.println(s4.lastIndexOf("hard"));//17
		//The following 2 ones are detailed no worries about them
		System.out.println(s4.lastIndexOf('d', 7));//3
		System.out.println(s4.lastIndexOf("udy", 3));//2
		
		//10.
		String s6 = "Study hard, stay humble.";
		//Do not forge, the index of last character equals to length()-1
		System.out.println(s6.length());//24
		
		//11.replace()
		System.out.println(s6.replace('h', 'c'));//Study card, stay cumble.
		System.out.println(s6.replace("y", ""));//Stud hard, sta humble.
		System.out.println(s6.replace(" ", ""));//Studhard,stahumble.	
		System.out.println(s6.replace('x', '!'));//Study hard, stay humble.		
		System.out.println(s6);//Study hard, stay humble.
		System.out.println(s6.replace("hard", "much"));//Study much, stay humble.
		System.out.println(s6.replace("", "!"));//!S!t!u!d!y! !h!a!r!d!,! !s!t!a!y! !h!u!m!b!l!e!.!
		
		//12.startsWith()
		String s7 = "Learn Java earn money";
		System.out.println(s7.startsWith("L"));//true
		System.out.println(s7.startsWith(""));//true
		System.out.println(s7.startsWith("l"));//false
		//If you want to check which index has which character, use the followings
		System.out.println(s7.startsWith("J",6));//true
		System.out.println(s7.startsWith("e", 10));//false

	}

}
