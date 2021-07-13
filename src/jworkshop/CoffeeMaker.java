package jworkshop;

public class CoffeeMaker {
	
	public void recipe(){
		
		boilWater();
		addCoffeeBag();
		pourCoffee();
		addCondiments();
	}
	
	private void boilWater(){
		System.out.println("Boiling water");
	}
	
	private void addCoffeeBag(){
		System.out.println("Add coffee bag");
	}
	
	private void pourCoffee(){
		System.out.println("Pour coffee");
	}
	
	private void addCondiments(){
		System.out.println("Add condiments");
	}

}
