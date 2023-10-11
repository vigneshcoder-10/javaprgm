package verymuchinterested;

public class Vmi {

	public static void main(String[] args) {
	           
		int[] a= {11,9,110,6,7};
		int b=0;
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
			  if(a[i]<a[j]) {
					b=a[i];
					a[i]=a[j];
					a[j]=b;
			}	
			}
		}	
		for(Object o:a) {
			System.out.println(o);
		}
		
	}

}

