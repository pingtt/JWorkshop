package jworkshop;

import java.util.Stack;

public class TypeCasting {
	
	public static void main(String[] args){
		int i = 10;
		long l = i;
		
		double d = 0.2;
		float f = (float) d;
		d = f;
		
		Basic4 b = new Basic4();
		Object o = b;
		b = (Basic4) o;
		
		int[] array = new int[5];
		Object o2 = array;
		
		//Before Java 5
		Stack s1 = new Stack();
		s1.push("cat");
		s1.push("dog");
		String thing1 = (String) s1.pop();
		
		//After Java 5
		Stack<String> s2 = new Stack<String>();
		s2.push("cat");
		s2.push("dog");
		String thing2 = s2.pop();
	}

}
