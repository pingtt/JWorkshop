package jworkshop;

public class GenericMethodDemo {
	
	public <T> void reverse(T[] data){
		int low =0;
		int high = data.length -1;
		
		while(low < high){
			//swapping the position
			T temp = data[low];
			data[low++] = data[high];
			data[high--] = temp;
		}
	}
	

	
	public static void main(String[] args){
		String[] stringArr = {"a", "b", "c", "d"};
		Integer[] intArr = {1, 2, 3, 4};
		
		GenericMethodDemo gmd = new GenericMethodDemo();
		gmd.reverse(stringArr);
		for(int i=0; i< stringArr.length; i++)
			System.out.println(stringArr[i]);
		
		gmd.reverse(intArr);
		for(int i=0; i< intArr.length; i++)
			System.out.println(intArr[i]);
	}

}
