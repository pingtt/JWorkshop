package jworkshop;

import java.io.*;

public class WriterExamples {
	
	public void writeCharFile(String aLine, String output){
		
		try{
			FileWriter fw = new FileWriter(output);
			
			fw.write(aLine + "\n");
			
			fw.close();
			
		} catch(IOException e){
			System.out.println(e);
		} 
	}
	
	public void writeAnyEncodingFile(String aLine, String output, String charSet){
		
		try{
			FileOutputStream fos = new FileOutputStream(output);
		    OutputStreamWriter osw = new OutputStreamWriter(fos, charSet);
		    BufferedWriter bw = new BufferedWriter(osw);
			
			bw.write(aLine + "\n");
			
			bw.close();
			
		} catch(IOException e){
			System.out.println(e);
		} 
	}
	
	public static void main(String[] args){
		
		WriterExamples we = new WriterExamples();
		we.writeCharFile("Hello World!", "output.txt");
		
		we.writeAnyEncodingFile("2016年世界大学学术排名", "output-utf8.txt", "UTF-8");
	}

}
