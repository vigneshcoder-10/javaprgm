package mayukh;

public class MalayalamString {

	public static void main(String[] args) {
		String s="MALAYALAM";
		s=s.toLowerCase();
		for(int i=0;i<s.length();i++) {
			Character c=s.charAt(i);
			if(c=='m') {
	          System.out.print('o');
			}
			else	if(c=='a') {
		          System.out.print('c');
				}
			else	if(c=='l') {
		          System.out.print('n');
				}
			else	if(c=='y') {
		          System.out.print('a');
				}
		}

	}

}
