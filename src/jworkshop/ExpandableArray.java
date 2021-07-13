package jworkshop;

import java.util.Vector;
import java.util.ArrayList;

public class ExpandableArray {
	
	public static void main(String[] args){
		
		Vector<String> words = new Vector<String>();
		words.add("apple");
		words.add("boy");
		words.add("cat");
		String myFirstWord = words.get(0);
		System.out.println("Word: " + myFirstWord);
		
		ArrayList<String> al = new ArrayList<String>(); 
		al.add("apple");
		al.add("boy");
		al.add("cat");
		myFirstWord = al.get(0);
		System.out.println("Word: " + myFirstWord);
		
	}

}
