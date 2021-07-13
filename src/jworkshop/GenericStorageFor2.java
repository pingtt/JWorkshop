package jworkshop;

public class GenericStorageFor2<A, B> {
	
	A a;
	B b;
	
	GenericStorageFor2(A a, B b){
		this.a = a;
		this.b = b;
	}
	
	A getFirst(){
		return a;
	}
	
	B getSecond(){
		return b;
	}
	
	public static void main(String[] args){
		GenericStorageFor2<String, Integer> gs = new GenericStorageFor2<String, Integer>(
				new String("abc"), 5);
		System.out.println(gs.getFirst());
		System.out.println(gs.getSecond());
		
		GenericStorageFor2<Boolean, String> gs2 = new GenericStorageFor2<Boolean, String>(
				true, "test");
		
		gs2.getFirst();
		gs.getFirst();
	}

}
