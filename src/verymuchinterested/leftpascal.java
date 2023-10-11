package verymuchinterested;

public class leftpascal {

	public static void main(String[] args) {
		int rows =5;
		for(int i=1;i<=rows;i++) {
			for(int j=rows;j>i;j--) {
				System.out.print("  ");
			}
			for(int k=i;k>=1;k--) {
				System.out.print(" *");
			}
			System.out.println();
		}
          for(int z=1;z<=rows;z++) {
        	  for(int y=rows-z;y<rows-1;y++) {
           	   System.out.print("  ");
           	        	  }
        	  for(int v=rows;v>=z;v--) {
        		 System.out.print(" *");
        	  }
        	  System.out.println();
          }
	}

}
