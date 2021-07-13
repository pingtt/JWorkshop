package jworkshop;

public class StaticModifier {
	
	public static void main(String[] args){
		System.out.println("i = " + SomeClass.i);
		SomeClass.helloWord();
		
		SomeClass sc1 = new SomeClass();
		SomeClass.i = 5;
		sc1.j = 5;

		sc1.print_ij();
		SomeClass sc2 = new SomeClass();
		sc2.print_ij();
	}
}

class SomeClass{
	
	public static int i = 10;
	public int j = 10;
	
	public static void helloWord(){
		System.out.println("hello world!");
	}
	
	public void print_ij(){
		System.out.println("i: " + i);
		System.out.println("j: " + j);
	}
}