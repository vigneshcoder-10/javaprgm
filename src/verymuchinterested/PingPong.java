package verymuchinterested;

public class PingPong {

	public static void main(String[] args) {
		int rows =5;
		for(int i=1;i<=rows;i++) {
			for(int j=rows;j>=i;j--) {
				System.out.print("* ");
			}
			for(int z=rows;z<=rows+i*2;z++) {
				System.out.print(" ");
			}
			for(int k=rows;k>=i;k--) {
				System.out.print(" *");
			}
		System.out.println();
		}	
       for(int q=1;q<=rows;q++) {
    	   for(int l=5;l>=1;l--) {
    		   System.out.print("* ");
    	   }
    	   for(int o=5;o>=q;o--) {
				System.out.print("  ");
			}
    	   for(int s=1;s<=q;s++) {
    		   System.out.print("* ");
    	   }
    	   System.out.println();
       }
	}

}
