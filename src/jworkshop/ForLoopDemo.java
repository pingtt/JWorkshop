package jworkshop;

import java.util.Vector;

public class ForLoopDemo {
	
	private int[] numbers = {2, 4, 6, 8, 10};
	Vector<Integer> numberList = new Vector<Integer>();
	
	public void generalForLoop(){
		
		//Before Java5,
		for (int i=0; i<numbers.length; i++) { 
			int item = numbers[i];
			System.out.println("Value is: " + item);
		}

	}
	
	public void generalInfiniteForLoop(){
		
		int count = 0;
		for(;;){
			if (count == 10)
				break;
			count++;
		}
		
	}
	
	public void enhancedForLoop(){
		
		//Since Java5: Enhanced for loop. can be used for array
		for (int item : numbers) { 
			System.out.println("Value is: " + item); 
			numberList.addElement(item);
		}
		
		//can be used for iterator
		for (int item : numberList){
			System.out.println("Value is: " + item); 
		}
	}
	
	private int[][] matrix = {{0, 2}, {4, 6}, {8, 10}};
	
	public void innerLoop(){
		
		for (int i=0; i<matrix.length; i++) { 
			for (int j=0; j<matrix[i].length; j++){
			 System.out.println("Value is: " + matrix[i][j]);
			}
		}
	}
	
	public static void main(String[] args){
		ForLoopDemo f = new ForLoopDemo();
		f.generalForLoop();
		f.enhancedForLoop();
		
	}

}
