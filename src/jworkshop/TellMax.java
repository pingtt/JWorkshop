package jworkshop;

public class TellMax<A> {
	
	public void printMax(Max<A> m, A[] array ){
		
		A max = array[0];
		
		for(int i=1; i<array.length; i++){
			
			if (! m.compare(max, array[i])){
				max = array[i];
			}
		}
		
		System.out.println(max);
	}

}
