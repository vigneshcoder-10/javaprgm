package mayukh;


public class Stringprogram {

	public static void main(String[] args) {
		
		String a="abcde";
		char d=a.charAt(a.length()-1);
		String b="";
		int i;
		for( i=2;i<a.length();i++) {
			b=b+a.charAt(i);;
		}
		b=b+ ++d;
		b=b+ ++d;
		System.out.println(b);
			}
			}
	
			


