package verymuchinterested;

import java.util.Scanner;

public class ParticularPartReverse {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		
		System.out.println("Enter a String Parts to Reverse: ");
		String s1=s.nextLine();
		
		StringBuffer g=new StringBuffer();
		
		String [] s5=s1.split(" ");
		
	      for(String o:s5) {
	    	StringBuffer s2=new StringBuffer(o);
	    	  s2.reverse();
	    	  g.append(s2).append(" ");
	    	  
	      }
		
		System.out.println(g);
		s.close();

	}

}
