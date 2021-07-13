package jworkshop;

public class IfElseDemo {
	
	public static void main(String[] args){
		
		int intValue = 10;
		
		assert (intValue < 10);
		
		if (intValue > 10){
			System.out.println("The value is more than 10");
		} else if (intValue == 5){
			System.out.println("The value is equal to 5");
		} else{
			System.out.println("The value is less than 10");
			assert (intValue < 10);	
		}
		
		boolean booValue = true;
		
		if (booValue){
			System.out.println("The value is true");
		}
	}

}
