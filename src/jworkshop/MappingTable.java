package jworkshop;

import java.util.Hashtable;
import java.util.HashMap;

public class MappingTable {
	
	public static void main(String[] args){
		Hashtable<String, String> ht = new Hashtable<String, String>();
		ht.put("a", "apple");
		ht.put("b", "boy");
		ht.put("c", "cat");
		
		System.out.println(ht.get("b"));
		
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("a", "apple");
		hm.put("b", "boy");
		hm.put("c", "cat");
		
		System.out.println(hm.get("c"));
	}

}
