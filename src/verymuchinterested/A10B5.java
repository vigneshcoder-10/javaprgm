package verymuchinterested;

public class A10B5 {

	public static void main(String[] args) {
		String s="10A5B6C";
		char [] ch=s.toCharArray();
		for(int i=0;i<ch.length;i++) {
			String s2="";
			while(i<ch.length&&Character.isDigit(ch[i]))
			{
				s2=s2+ch[i];
				i++;
			}
			char c=ch[i];
			int j=Integer.parseInt(s2);
			for(int k=0;k<=j;k++) {
				System.out.print(c+" ");
			}
			
			System.out.println();
		}
 	}

}
