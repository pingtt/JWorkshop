package jworkshop;

public class PrimitiveWrapper {
	
	//declare and initialize variables
	boolean boo = true;  
	char c ='a';		
	byte b = 01;
	short s = 15;
	int i = 9;
	long l = 3;
	float f = 0.2f;
	double d = 0.5;
	
	//before Java 5
	Integer i2 = new Integer(5);
	int i3 = i2.intValue();
	int i5 = i2;
	
	
	Boolean boo2 = new Boolean(true);
	
	//after Java 5
	Boolean boo3 = true;
	boolean boo4 = boo3;
	Integer i4 = i2 + i3;
	
	Character c2 = new Character('a');
	Character c3 = 'a';

}
