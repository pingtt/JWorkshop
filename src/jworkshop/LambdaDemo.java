package jworkshop;

public class LambdaDemo {
	
	
    public void printMin(MinString m, String[] array ){
		
		String min = array[0];
		
		for(int i=1; i<array.length; i++){
			
			if (! m.compare(min, array[i])){
				min = array[i];
			}
		}
		
		System.out.println(min);
	}
    
    public void printResult(MinString m){
    	
    }
	
	public static void main(String[] args){
		
		String[] list = {"abc", "xyze", "i", "re"};
		LambdaDemo ld = new LambdaDemo();

		ld.printMin( (String s1, String s2) -> s1.length() < s2.length(), 
				list);
		
	}

}
