package verymuchinterested;

public class firstmin {

	public static void main(String[] args) {
   int[] a= {6,4,5,67,8,1};
   int fmin=a[1];
   for(int i=0;i<a.length;i++) {
	   if(a[i]<fmin) {
		   fmin=a[i];
	   }
   }
   System.out.println(fmin);

	}

}
