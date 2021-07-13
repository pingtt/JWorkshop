package jworkshop;

public class PrimitiveManipulator {
	
	//declare and initialize variables
	public boolean boo = true;  
	char c ='a';		
	byte b = 01;
	short s = 15;
	int i = 9;
	long l = 3;
	float f = 0.2f;
	double d = 0.5;
	int val;

	
	PrimitiveManipulator(int i){
		this.i = i;
	}
	
	public long calculate(int i){
		long l = 4;

		return l + i; 
	}
	
	public void printThis(){
		char a=65;
		System.out.println(a);
	}
	
	public void operatorPrecedence(){
		int x =3;
		x += 7 * 2;
		
		System.out.println(x);
	}
	
	public static void main(String[] args){
		PrimitiveManipulator pm = new PrimitiveManipulator(10);
		System.out.println( pm.calculate(5));
		
	    pm.operatorPrecedence();
	}
	

}
