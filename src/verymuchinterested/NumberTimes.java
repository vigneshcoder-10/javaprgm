package verymuchinterested;

public class NumberTimes {

	public static void main(String[] args) {
		
	String a="a10";
	String b="b5";
	String c="c15";
	
	String count ="";
	String count2="";
	String count3="";
	for(int i=0;i<a.length();i++) {	 
		
		if( a.charAt(i)<='A'&&a.charAt(i)>= '0' ) {
			char ch=a.charAt(i);
		      count=count+ch;
		}	
	}
	int acount=Integer.parseInt(count);
		for(int j=1;j<=acount;j++) {
		System.out.println(a);
	}
		for(int i=0;i<b.length();i++) {	 
			
			if( b.charAt(i)<='A'&&b.charAt(i)>= '0' ) {
				char ch=b.charAt(i);
			      count2=count2+ch;
			}	
		}
		int bcount=Integer.parseInt(count2);
			for(int j=1;j<=bcount;j++) {
			System.out.println(b);
		}
			for(int i=0;i<c.length();i++) {	 
				
				if( c.charAt(i)<='A'&&c.charAt(i)>= '0' ) {
					char ch=c.charAt(i);
				      count3=count3+ch;
				}	
			}
			int ccount=Integer.parseInt(count3);
				for(int j=1;j<=ccount;j++) {
				System.out.println(c);
			}
}
}