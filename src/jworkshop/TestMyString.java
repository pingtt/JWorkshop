package jworkshop;

public class TestMyString {
	
	public static boolean compare2String(String val1, String val2){

		return val1.equalsIgnoreCase(val2);

	}
	
	public boolean compare2StringVer2(String val1, String val2){
		
		val1 = val1.toLowerCase();
		val2 = val2.toLowerCase();
		
		return val1.equals(val2);
	}
	
	public static void main(String[] args){
		TestMyString t = new TestMyString();
		System.out.println(TestMyString.compare2String("abc", "ABC"));
	}

}
