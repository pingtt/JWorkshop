package jworkshop;

import java.io.FileReader;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.io.*;

public class ExceptionTest {
	
	public void unchecked(){
		Scanner reader = new Scanner(System.in);  
		System.out.println("Enter a number: ");
		try{
			int n = reader.nextInt();
			
		} catch(InputMismatchException e){
			System.out.println(e);
		} finally{
			System.out.println("Program recover...");
		}
		
		//No try and catch here
		//n = reader.nextInt();
		System.out.println("exit");
	}
	
	public void checked1() {
		try{
		FileReader fr = new FileReader("myFile.txt");
		} catch(IOException e){
			System.out.println(e);
		} finally{
			System.out.println("program ends");
		}
	}
	
	public void checked2() throws IOException{
		FileReader fr = new FileReader("myFile.txt");
	}
	
	public void checked3() throws IOException{
		throw new IOException();
	}
	
	public static void main(String[] args) {
		ExceptionTest et = new ExceptionTest();
		//et.unchecked();
		//et.checked1();
		//et.checked2();
	}
}
