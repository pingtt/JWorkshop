package jworkshop;

public class StringMax implements Max<String>{
	
	public void printMax(){
		//do something...
	}
	
	public boolean compare(String a, String b){
		
		return a.length() > b.length();
	}
	
	public static void main(String[] args){
		String[] list = {"abc", "xyze", "i", "re"};
		TellMax<String> tm = new TellMax<String>();
		tm.printMax(new StringMax(), list);
	}

}
