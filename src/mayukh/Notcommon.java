package mayukh;

import java.util.Arrays;

public class Notcommon {

	public static void main(String[] args) {
		
     int [] a= {1,2,7,6};
     int [] b= {2,6,3,5};
     int [] c=new int[a.length+b.length];
		
		for(int i=0,k=0;i<c.length;i++) {
			if(i<a.length) {
			c[i]=a[i];
			}
			else if(k<b.length) {
				c[i]=b[k];
			     k++;
			}
		}
		 boolean[] b1=new boolean[c.length];
		 
		 for(int z=0;z<c.length;z++) {
			 if(b1[z]!=true) {
				 int count=1;
				 for(int h=z+1;h<c.length;h++) {
					 if(c[z]==c[h]) {
					 count++;
					 b1[h]=true;
				 }
			 }
			 if(count==1) {
				 System.out.print(c[z]+" ");
			 }
			 }
		 }
		
	}
}
