package verymuchinterested;

public class firstDistinct {

	public static void main(String[] args) {
		  
		int [] a= {1,3,5,5,1,7,7,6};
		  boolean b[]=new boolean[a.length];
		  
		  for(int  i=0;i<a.length;i++) 
		  {
			  if(b[i]!=true) 
			  {
				  int count=1; 
			 for(int j=i+1;j<a.length;j++) 
			 {
				     
				 if(a[i]==a[j])
				 {
					 count++;
					 b[j]=true;
					    
				 }
			 }
			  
			  if(count>1) {
				  System.out.println(a[i]);
				 break;
			  }
			  }
			  }
		  }

	}


