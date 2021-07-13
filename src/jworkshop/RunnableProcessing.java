package jworkshop;

public class RunnableProcessing implements Runnable{
	
	private int start; 
	private int end;
	private int[] primeList = new int[40000];
	
	public RunnableProcessing(int start, int end){
		this.start = start;
		this.end = end;
	}
	
	/*
	 * The method will concatenate a number of string before it ends.
	 * (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	public void run(){
		int count = 0;
		long startTime = System.currentTimeMillis();
		
		for(int i=start;i<end;i++) {
	        boolean flag = isPrime(i);
	        if (flag){
	        	synchronized(primeList){
	        		primeList[count] = i;
	        		count = count + 1;
	        	}
	        }
	    }
		
		long endTime = System.currentTimeMillis();
		long duration = endTime - startTime;
		
		System.out.println("Total time taken (ms): " + duration);
		System.out.println("Total prime: " + count);
		
	}
	
	public synchronized void addPrime(int value, int count){
		primeList[count] = value;
	}
	
	
	/**
	 * Evaluate whether a number is prime
	 * @param n an integer
	 * @return true: a prime number; false: not a prime number
	 */
	private boolean isPrime(int n) {
	    for(int i=2;i<n;i++) {
	        if(n%i==0)
	            return false;
	    }
	    return true;
	}

}
