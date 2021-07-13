package jworkshop;

public class Array {
	
	public static void main(String[] args){
		
		//primitive type array is assigned 0 automatically 
		//after the array is created.
		int[] intArray = new int[10];
		intArray[0] = 1;
		
		//declare and assign values
		float[] floatArray = { 0.1f, 0.2f, 0.3f, 0.4f, 0.5f };
		
		//create an instance of an array. Each reference of the object 
		//is assigned to NULL. Each element in the array has to be instantiated 
		//seperately
		String[] stringArray = new String[10];
		for(int i=0; i<stringArray.length; i++){
			stringArray[i] = new String();
		}
		
		System.out.println(intArray[0]);
		System.out.println(floatArray[0]);
		
	}

}

