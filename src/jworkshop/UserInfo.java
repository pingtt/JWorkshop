package jworkshop;

public class UserInfo {
	
	String name;
	String telephone;
	
	public UserInfo(String name){
		this.name = name;
		//this(name, null);
	}
	
	public UserInfo(String name, String telephone){
		this.name = name;
		this.telephone = telephone;
	}
	
	public void updateTel(String val){
		telephone = val;
	}
	
	public void printTel(){
		System.out.println(telephone);
	}

}
