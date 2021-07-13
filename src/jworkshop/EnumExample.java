package jworkshop;

public class EnumExample {
	
	public enum Day {MON, TUE, WED, THU, FRI, SAT, SUN};
	
	public void printDay(Day today){
		
		if (today == Day.FRI){
			System.out.println("Today is Friday");
		}
		
		if (today == Day.MON){
			System.out.println("Today is Monday");
		}
	
	}
	
	public static void main(String[] args){
		EnumExample ee = new EnumExample();
		ee.printDay(Day.FRI);
	}

}
