package jworkshop;

public class AnonymousDemo {
	
	
	public static void main(String[] args){
		
		//Example of anonymous class that extends from Basic2 class
		Basic2 b = new Basic2(){
			
			//Overwrite 
			public void myPrint(int s){
				System.out.println("Overwriting method: " + s);
			}
			
			
		};
		
		b.myPrint(20);
		
		Max<Integer> m = new Max<Integer>(){
			
			public boolean compare(Integer a, Integer b){
				
				return a.intValue() > b.intValue();
			}
			
			public void printMax(){
				//do something...
			}
		};
		
		Integer[] list = {20, 6, 12, 40, 5};
		TellMax<Integer> tm = new TellMax<Integer>();
		tm.printMax(m, list);
	}
}
