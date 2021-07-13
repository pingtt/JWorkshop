package jworkshop;

public class MyApp {
	
	public static void main(String[] args){
		/*UserInfo u = new UserInfo("John");
		UserInfo u2 = new UserInfo("Mary", "0123456789");
		u2.printTel();
		
		u2.updateTel("0987654332");
		u2.printTel();*/
		
		CoffeeMaker maker = new CoffeeMaker();
		maker.recipe();
		maker.boilWater();

	}

}
