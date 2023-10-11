package mayukh;

import java.util.Scanner;

public class subStringRev {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
         System.out.println("Enter A String:");
         String s1=s.nextLine();
         s.close();
         StringBuffer b=new StringBuffer();
         String s2[]=s1.split(" ");
     
         for(String s3:s2) {
        	 StringBuffer b1=new StringBuffer(s3);
        	// b1.reverse();  
        	//this is one way
        	// System.out.print(b1+" ");
           //one more way
        	// b1.reverse();
        	// b.append(b1).append(" ");
        	 //this is one more way
        	 
        	 String s5="";
        	 for(int i=0;i<s3.length();i++) {
        	    s5=s3.charAt(i)+s5;
        	 }
        	 System.out.print(s5+" ");
        	 }
        // System.out.print(b);
        
	}
}
