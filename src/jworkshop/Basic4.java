package jworkshop;

import java.util.Stack;


public class Basic4 {
	
	

	public static void main(String[] args){

		Stack s = new Stack();
		s.push("cat");
		s.push("dog");
		String thing = (String) s.pop();
		
		System.out.println(thing);
	}

}
