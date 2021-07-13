package jworkshop;

public class MultiThreading {
	
	
	public static void main(String[] args){
		
		//NOTE: TEST THREAD 1 OR 
		//Start thread 1
		//Thread t1 = new Thread(new RunnableProcessing(2, 400000));
		//t1.start();
		
		
		
		//Start 4 threads
		//Note: For this test, just take the time for the thread that is the longest
		( new Thread(new RunnableProcessing(2, 100001))).start();
		( new Thread(new RunnableProcessing(100000, 200001))).start();
		( new Thread(new RunnableProcessing(200000, 300001))).start();
		( new Thread(new RunnableProcessing(300000, 400001))).start();
		
	}

}
