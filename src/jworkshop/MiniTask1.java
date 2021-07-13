package jworkshop;

import java.io.FileWriter;
import java.io.IOException;

public class MiniTask1 {
	
	public static void main(String args[]) throws IOException{
		int x=0;
		int y = 5;
		int z = x & y;
		char a = 65;
		boolean d = false;
		boolean e = true;
		boolean f = d != e;
		System.out.println(a);
		FileWriter fw = new FileWriter("myFile.txt");
		fw.write("I write something here\n");
		fw.close();
	}

}
