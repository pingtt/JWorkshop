package jworkshop;



public enum Day {
	
	MON(2), TUE(3), WED(4), THU(5), FRI(6), SAT(7), SUN(1);

	public final int value;
	
	Day(int value){
	    this.value = value;
	}
	
	public int getDayValue(){
		return value;
	}
	

	public static void main(String[] args){
		System.out.println(FRI.getDayValue());
		
	}

}
