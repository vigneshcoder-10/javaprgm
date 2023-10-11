package verymuchinterested;

public class firstduplicate {

	public static void main(String[] args) {
		
		int [] a= {1,3,5,1,7,7};
		  boolean b[]=new boolean[a.length];
		  boolean b1=false;
		  for(int  i=0;i<a.length;i++) 
		  {
			  int count=1;
			  if(b[i]!=true) 
			  {
				 
			 for(int j=i+1;j<a.length;j++) 
			 {
				   if(b1!=true) 
				   {
				 if(a[i]==a[j])
				 {
					 count++;
					 b[j]=true;
					    b1=true;
				 }
			 
			 }
			  }
			  if(count>1) {
				  System.out.println(a[i]);
			  }
			  }
		  }        
	}
}

