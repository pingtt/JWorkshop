package jworkshop;

public class StaticBlock {
	

	
	public StaticBlock(){
		System.out.println("constructor");
	}
	
	
	static{
		int var = 10;
		String stringVar = "25";
		System.out.println("static");
	}
	
	
	public static void main(String[] args){
		StaticBlock sb = new StaticBlock();

	}

}
