package verymuchinterested;

import java.util.Scanner;

public class Lcm {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
				s.close();
		int lcm=a;
        while(!(lcm%b==0&&lcm%c==0)) {
        	lcm=lcm+a;
        }
        System.out.println(lcm);
	}

}
