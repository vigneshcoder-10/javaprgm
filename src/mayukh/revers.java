package mayukh;

public class revers {
	public static void main( String[] args) {
		String s1 = "this is java";
		String [] s2 = s1.split(" ");
		
		for (int i = s2.length-1; i >=0; i--) {
			System.out.print(s2[i]+"  ");
		}
	}
}
