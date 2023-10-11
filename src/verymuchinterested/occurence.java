package verymuchinterested;

public class occurence {

	public static void main(String[] args) {
		int [] a= {8,8,8,5,5,5,6,6,6,6,6};
		
		boolean [] b=new boolean[a.length];
		
		int occur=0;
		int check=0;
		int check1=0;int times=0;
		for(int i=0;i<a.length;i++) {
			int count=1;
			
				for(int j=i+1;j<a.length;j++) {
					if(b[i]!=true)
					if(a[i]==a[j]) {
						check=count;
						if(check>check1) {
							check1=check;
						}
						count++;
						b[j]=true;
						}
				
						if(count>check1) {
							occur=a[i];
							times=count;
						}			
						}
					}
			
		System.out.println(occur+" is occured many "+ times+"  Times" );
	}
}
