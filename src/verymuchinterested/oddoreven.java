package verymuchinterested;

public class oddoreven {

	public static void main(String[] args) {
		StringBuilder s=new StringBuilder();
       int num=10;
       while(num>0) {
    	   int rem=num%2;
    	   s.append(rem);
    	    num=num/2;
       }
       StringBuilder s1=s.reverse();
	String s3=new String(s1);
	System.out.println(String.valueOf(s3));
	char[] ch = s3.toCharArray();
       
       for(int i=ch.length-1;i>=0;i--) {
       
		if(ch[i]=='0') {
			System.out.println("even");
			break;
		}
		else if (ch[i]=='1'){
			System.out.println("odd");
			break;
		}
       }
}
}
