package jworkshop;

import java.util.Vector;

public class VectorTest {
	
	public static void main(String[] args){
		
		Vector<String> v = new Vector<String>();
		v.add("orange");
		//v.add(new Integer(1));
		
		for(int i=0; i<v.size(); i++){
			String item = (String) v.get(i);
		}
		
	}

}
