package jworkshop;

import java.io.*;

public class ReaderExamples {
	
	
	public void readCharFile1(String input){
		try{
			File f = new File(input);
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			
			String line = br.readLine();
			while(line != null){
				System.out.println(line);
				line = br.readLine();
			}
			br.close();
			fr.close();
			
		} catch(IOException e){
			System.out.println(e);
		}
	}
	
	
	public void readCharFile2(String input){
		try{
			File f = new File(input);
			FileReader fr = new FileReader(f);
			LineNumberReader lnr = new LineNumberReader(fr);
			
			String line = lnr.readLine();
			while(line != null){
				System.out.println(line);
				line = lnr.readLine();
			}
			lnr.close();
			fr.close();
			
		} catch(IOException e){
			System.out.println(e);
		}
	}
	
	
	
	public void readAnyEncodingFile(String input, String charSet){
		try{
			FileInputStream fis = new FileInputStream(input);
		    InputStreamReader isr = new InputStreamReader(fis, charSet);
		    BufferedReader br = new BufferedReader(isr);
			
			String line = br.readLine();
			while(line != null){
				System.out.println(line);
				
				line = br.readLine();
			}
			
			br.close();
			isr.close();
			fis.close();
			
		} catch(IOException e){
			System.out.println(e);
		}
	}
	
	public void readWriteBinaryFile(String input, String output){
		try{
			File inputFile = new File(input);
			FileInputStream fis = new FileInputStream(inputFile);
		    BufferedInputStream bis = new BufferedInputStream(fis);
		    
		    FileOutputStream fos = new FileOutputStream(output);
		    BufferedOutputStream bos = new BufferedOutputStream(fos);
		    
		    int totalBytesRead = 0;
		    byte[] result = new byte[(int) inputFile.length()];
		    
	        while(totalBytesRead < result.length){
	          int bytesRemaining = result.length - totalBytesRead;

	          int bytesRead = bis.read(result, totalBytesRead, bytesRemaining); 
	          bos.write(result, 0, totalBytesRead);
	          if (bytesRead > 0){
	            totalBytesRead = totalBytesRead + bytesRead;
	          }
	        }
	        
			bis.close();
			fis.close();
			
		} catch(IOException e){
			System.out.println(e);
		}
	}
	
	
	public File[] getTxtFileOnly(File dir){
		File[] files = dir.listFiles(new FilenameFilter(){
			@Override
			public boolean accept(File dir, String name) {
				
				if (name.endsWith(".txt") || name.endsWith(".TXT")){
					return true;
				} else{
					return false;
				}
			}
		});
		
		return files;
	}
	
	public static void main(String[] args){
		ReaderExamples re = new ReaderExamples();
		re.readCharFile1("mandarin-utf8.txt");
		re.readAnyEncodingFile("mandarin-gb2312.txt", "GB2312");
	}

}
