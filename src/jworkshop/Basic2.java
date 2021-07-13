package jworkshop;

/**
 * hhh
 * @author pingtt
 *
 */
public class Basic2 {
	
	String value;

	
	public Basic2(){
		this("default");
	}
	
	/**
	 * 
	 * @param value
	 */
	public Basic2(String value){
		this.value = value;
	}
	

	
	public void myPrint(){
		myPrint(10);
	}
	
	/**
	 * ghjgh
	 * @param val hjhg
	 */
	public void myPrint(int val){
		System.out.println("The argument is: " + val);

	}
	
	public static void main(String[] args){
		Basic2 b = new Basic2();
		b.myPrint(5);
		
		b.myPrint();
	}

}
