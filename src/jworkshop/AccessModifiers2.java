package jworkshop;

public class AccessModifiers2 extends AccessModifiers{

		public void publicAccess(){
			
			int i = 0;
			boo = false;
			//s = 6;
			super.i = 9;
			i = 10;
			f = 0.5f;
		}
		
		public static void main(String[] args){
			AccessModifiers2 a = new AccessModifiers2();
			
		}
}
