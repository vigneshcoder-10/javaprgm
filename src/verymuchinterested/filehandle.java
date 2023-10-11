package verymuchinterested;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class filehandle {

	public static void main(String[] args) throws IOException {
		
	File f=new File("C:\\Users\\ELCOT\\Desktop\\h.txt");	

		FileReader f1=null;
		String  s=null;
		  try {
			  f1=new FileReader(f);
			  long size =f.length();
			  char [] a=new char[(int)size];
			  f1.read(a);
			  s=new String(a);
			  System.out.println(a);
		  }
		catch(Exception i) {
			i.printStackTrace();
		}
		  finally {
			  f1.close();
		  }
		  File f2=new File("C:\\Users\\ELCOT\\Desktop\\onemorecopy.txt");
		  FileWriter w=null;
		  try {
			  f2.createNewFile();
			  w=new FileWriter(f2);
			  w.write(s);
			  w.flush();
		  }
		catch(Exception i) {
			i.printStackTrace();
		}
		  finally {
			  w.close();
	}
}
}