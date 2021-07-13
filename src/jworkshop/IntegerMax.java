package jworkshop;

public class IntegerMax implements Max<Integer>{

	
	public void printMax(){
		//do something...
	}
	
	public boolean compare(Integer a, Integer b){
		
		return a.intValue() > b.intValue();
	}
	
	public static void main(String[] args){
		Integer[] list = {20, 6, 12, 40, 5};
		TellMax<Integer> tm = new TellMax<Integer>();
		tm.printMax(new IntegerMax(), list);
	}
}
