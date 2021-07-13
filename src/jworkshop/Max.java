package jworkshop;

public interface Max<A> {
	
	
	public void printMax();
	public boolean compare(A a, A b);
	
	/**
	 * Available since Java8
	 */
	public default void myprint(){
		System.out.println("yes!");
	}

}
