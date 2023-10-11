package verymuchinterested;

import java.util.Arrays;

public class duplicates {

	public static void main(String[] args) {
		int [] a= {1,2,2,2,23,56,7,1,5,7,7};
		boolean b[]=new boolean[a.length];
		int MostRepeatedElement=0;
		int MostRepeatCount=0;
          for(int i=0;i<a.length;i++) 
          {
        	  int count=1;
        	  if(b[i]!=true) {
        		 for(int j=i+1;j<a.length;j++) {
        			 if(a[i]==a[j]) {
        				 count++;
        			  b[j]=true; 
        		 } 
        		 }
        		 if(count>MostRepeatCount)
        		 {
        			 MostRepeatedElement=a[i];
        			 MostRepeatCount=count;
        		 }
        	  }
        	  
        	  }
          System.out.println(MostRepeatedElement+" present "+MostRepeatCount+" times");
          }
	}
	

