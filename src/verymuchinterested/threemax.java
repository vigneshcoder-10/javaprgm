package verymuchinterested;

import java.util.Scanner;

public class threemax {

	public static void main(String[] args) {
		int[] a= {12,34,6,5,74};
		int max=0;
		  for(int i=0;i<a.length;i++) {
			  for(int j=i+1;j<a.length;j++) {
				  if(a[i]<a[j]) {
					  max=a[i];
					  a[i]=a[j];
					  a[j]=max;
				  }
			  }
		  }
		  Scanner s=new Scanner(System.in);
		  try {
		  System.out.println("Enter how many Maximum values You want");
		  int g=s.nextInt();
		  for(int k=0;k<g;k++) {
			  System.out.println(a[k]);
		  }
	}
		  catch(Exception e) {
				System.out.println("Array length is only  "+a.length+"  values ");
			}
}
}