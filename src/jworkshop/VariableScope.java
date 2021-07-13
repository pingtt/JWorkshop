package jworkshop;

public class VariableScope {
	
    int integerValue;
    String stringValue;
    static int classInteger;


   public void myMethod(String stringValue){
      String localStringVal = "an example";
      this.stringValue = stringValue;
      
      {
    	  String anotherString = "another string";
    	  stringValue = anotherString;
      }
      

      
      String anotherString = "a different value";
      
   }
   
   public static void main(String[] args){
	   VariableScope s = new VariableScope();
   }


}
