package verymuchinterested;

public class main {

	public static void main(String[] args) {
		int [] a= {1,2,5,5,6,3,3};
		boolean[] b= new boolean[a.length];
		 for(int i=0;i<a.length;i++) {
			 if(b[i]!=true) {
				 int count=1;
				 for(int j=i+1;j<a.length;j++) {
					 if(a[i]==a[j]) {
						 count++;
						 b[j]=true;
					 }
				 }
				 if(count>1) {
					 System.out.println(a[i]+"count of  "+count);
					break;
				 }
			 }
		 }
	}
	
}