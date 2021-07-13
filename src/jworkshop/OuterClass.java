package jworkshop;

public class OuterClass {
	
	int i = 0;
	
	public class InnerClass{
		
		public int myMethod(){
			return i= 10;
		}	
	}
	
	public static class StaticNestedClass{
		
		public void myMethod(){
			//do something
			System.out.println("hello world!");
		}	
	}
	
	public static void main(String[] args){
		OuterClass o = new OuterClass();
		
		OuterClass.InnerClass i = o.new InnerClass();
		System.out.println( i.myMethod() );
		
		OuterClass.StaticNestedClass i2 = new OuterClass.StaticNestedClass();
		i2.myMethod();	
	}

}
