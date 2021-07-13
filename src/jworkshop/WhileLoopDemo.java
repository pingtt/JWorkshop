package jworkshop;

public class WhileLoopDemo {
	
	public void while1(){
		int count =0;
		while(count < 10){
			System.out.println(count);
			count++;
		}
	}
	
	
	public void while2(){
		int count =0;
		do{
			System.out.println(count);
			count++;
		}while(count < 10);
	}
	
	public static void main(String[] args){
		WhileLoopDemo w = new WhileLoopDemo();
		w.while1();
		w.while2();
	}

}
