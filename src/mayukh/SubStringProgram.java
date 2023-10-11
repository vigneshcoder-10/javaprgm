package mayukh;

public class SubStringProgram {

	public static void main(String[] args) {
		
		String s="this is program ";
		s.toLowerCase();
        String[] s2=s.split(" ");
		String s6="program";
		s6.toLowerCase();
       for(int i=0;i<s2.length;i++) { 
    	  if(s2[i].equals(s6)) {
    		  for(int j=0;i<s.length();j++) {
    			  if(s.charAt(j)=='p') {
    				  System.out.println(s.indexOf('p'));
    				  break;
    			  }
    		  }
    	  }
       }
        
	}
}
