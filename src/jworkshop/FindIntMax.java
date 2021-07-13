package jworkshop;

public class FindIntMax {
	
	public int getMax(int[] intArray){
		int result=intArray[0];
		
		for(int i=0; i< intArray.length; i++){
			
			if(result < intArray[i]){
				result = intArray[i];
			}
		}
		
		return result;
	}
	
	public static void main(String[] args){
		
		int[] array = { 10, 5, 3, 6, 15, 4};
		FindIntMax fim = new FindIntMax();
		int result = fim.getMax(array);
		System.out.println(result);
	}

}
