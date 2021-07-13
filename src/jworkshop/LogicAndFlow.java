package jworkshop;

public class LogicAndFlow {
	
	public static void main(String[] args){
		int x = 20;
		int y = 5;
		
		out1: while(x > y){
			out2: for (int i=0; i>10; i++){
				if (i == 5){
					break out1;
				} else if (i== 6){
					break out2;
				} else{
					//do something
					continue;
				}
			}
			x--;
		}
	}
}
