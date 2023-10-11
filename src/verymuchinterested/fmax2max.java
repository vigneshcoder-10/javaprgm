package verymuchinterested;

public class fmax2max {

	public static void main(String[] args) {

      int[] a= {10,60,1,500,8};
      int fmax=0;
      int tfmax=0;
     int thimax=0;
      for(int x:a) {
    	  if(x>fmax) {
    		  thimax=tfmax;
    		  tfmax=fmax;
    		  fmax=x;
    	  }
    	  else if(x>tfmax) {
    	       thimax=tfmax;
    		  tfmax=x;
    	  }
    	  else if(x>thimax) {
    		  thimax=x;
    	  }
      }
      System.out.println(fmax);
      System.out.println(tfmax);
      System.out.println(thimax);
	}

}
