package verymuchinterested;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class bufferhandle {
	public static void main(String[] args) throws IOException {
		
		File f=new File("C:\\Users\\ELCOT\\Desktop\\h.txt");
		FileReader f1=null;
		
		BufferedReader bf=null;
		String a=null;
		String o="";
		try {
			f1=new FileReader(f);
			 bf=new BufferedReader(f1);
			String p=bf.readLine();
			 o="";
			while(p!=null) {
			
				if(o!=null)
				{
				 o=o+"\n"+p;
				}
				System.out.println(p);
				p=bf.readLine();	
			}
		}catch(Exception q) {
			q.printStackTrace();
	}
		finally {
			bf.close();
		}
		File f3=new File("C:\\Users\\ELCOT\\Desktop\\pappu.txt");
		FileWriter h= new FileWriter(f3);
	     BufferedWriter bf1=null;
	     try {
	    	 f3.createNewFile();
	    	 bf1=new BufferedWriter(h);
	    	 bf1.write("Tokens is a Samllest unit");
	    	 bf1.write(o);
	    	 bf1.flush();
	     }catch(Exception i) {
	    	 i.printStackTrace();
	     }
		finally {
			bf1.close();
		}
}
}
