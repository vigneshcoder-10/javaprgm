package verymuchinterested;

public class rev10a5b {

	public static void main(String[] args) {
		
		String s="aaaabbbcc";
		
		char[] ch=s.toCharArray();
		for(int i=0;i<ch.length;)
		{
			   int count=0;
			   int pos=i;
			   char ch1= ch[i];
			while(pos<ch.length && ch[i]==ch[pos])
			{
			   count++;
		       pos++;
			}
			System.out.print(ch1+""+count);
			i=pos;
		}
		

	}

}
