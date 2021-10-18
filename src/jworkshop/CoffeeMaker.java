package jworkshop;

public class CoffeeMaker {
	
	public void recipe(){
		
		boilWater();
		addCoffeeBag();
		pourCoffee();
		addCondiments();
	}
	
	public void boilWater(){
		System.out.println("Boiling water");
	}
	
	public void addCoffeeBag(){
		System.out.println("Add coffee bag");
	}
	
	public void pourCoffee(){
		System.out.println("Pour coffee");
	}
	
	public void addCondiments(){
		System.out.println("Add condiments");
	}

}
