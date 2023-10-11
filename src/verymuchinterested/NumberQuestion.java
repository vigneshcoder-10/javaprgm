package verymuchinterested;

public class NumberQuestion {

	public static void main(String[] args) {
		
		String a="a10b5c15";
		
		String count="";
		String count2="";
		String count3="";
		
		for(int i=0;i<a.length();i++) {
			for(int j=0;j<a.length();j++) {
				 
					if(a.charAt(j)>='0'&&a.charAt(j)<='9'&&a.charAt(i)>='A'||a.charAt(i)<='z') {
						if(a.charAt(i)=='a') {
							if(a.charAt(j)>='0'&&a.charAt(j)<='9') {
							count=count+a.charAt(j);
						}
						}
						else if(a.charAt(i)=='b'){
							if(a.charAt(j)>='0'&&a.charAt(j)<='9') {
						count2=count2+a.charAt(j);
						}
						}
						else if(a.charAt(i)=='c') {
							if(a.charAt(j)>='0'&&a.charAt(j)<='9') {
							count3=count3+a.charAt(j);
						}
					}
				}
			}
		}
		System.out.println(count);
		System.out.println(count2);
		System.out.println(count3);
	}
}