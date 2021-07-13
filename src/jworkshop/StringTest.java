package jworkshop;

public class StringTest {
	
	public boolean compare2string(String str1, String str2){
		boolean result;
		return str1.equalsIgnoreCase(str2);
		
	}
	
	public static void main(String[] args){
		
		String str1 = "book";
		String str2 = "worm";
		String str3 = "book";
		String str4 = new String("book");
		
		System.out.println(str1 + str2);
		System.out.println(str1 == str3);
		System.out.println(str1 == str4);
		System.out.println(str1.equals(str4));
		System.out.println(" book".trim().equals(str4));
	}

}
