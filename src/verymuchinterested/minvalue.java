package verymuchinterested; 

import java.util.Arrays;
import java.util.Scanner;

public class minvalue {

	public static void main(String[] args) {
		int a[] = {12,4,1,56,98};
		int min=0;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j] ){
					min=a[j];
					a[j]=a[i];
					a[i]=min;
				}
			}
		}
		//System.out.println(Arrays.toString(a));
		Scanner s=new Scanner(System.in);
		try {
		System.out.println("Enter how Many Minimum Values");
        int p=s.nextInt();
        for(int k=0;k<p;k++) {
        	System.out.println(a[k]);
        }
	}
		catch(Exception e) {
			System.out.println("Array length is only  "+a.length+"  values ");
		}

}
}