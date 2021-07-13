package jworkshop;

/**
Class name: Basic
**/
public class Basic{
	
	//a state
	String name = "John";
	
	public Basic(){
		this("Ahmad");
	}
	
	public Basic(String name){
		this.name = name;
	}

	
	/**
	 * A behavior
	 */
	public void print1(){
		System.out.println("Hello " + name);
	}
	
	/**
	 * Another behavior
	 * @param value a string value
	 */
	public void print2(String value){
		name = value;
		print1();
	}

  //A special main() static function. 
	public static void main(String[] arg){
		
		Basic b = new Basic();
		
		Object obj = b;
		Basic b2 = (Basic) obj;
		b.print1();
		b.print2("John");
	}	
}

 