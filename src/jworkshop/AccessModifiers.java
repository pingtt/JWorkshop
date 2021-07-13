package jworkshop;

public class AccessModifiers {
	
	//declare variables
	public boolean boo = true;  
	public char c ='a';		
	private byte b = 01;
	private short s = 15;
	protected int i = 9;
	protected long l = 3;
	float f = 0.2f;
	final double d = 0.5;
	
	public void publicAccess(){
		
	}
	
	private void privateAccess(){
		
	}
	
	public static void main(String[] args){
		AccessModifiers am = new AccessModifiers();
		am.privateAccess();
	}
	
	

}

class MyClass1{
	
	public void myMethod(){
		AccessModifiers am = new AccessModifiers();
		am.boo = false;
		//am.b = 0;
		am.i = 10;
		am.f = 20;
	}
	
}


