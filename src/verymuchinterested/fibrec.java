package verymuchinterested;

import java.util.Arrays;

public class fibrec {

	public static void main(String[] args) {
		int num=7;
		int[] a=new int[num];
		while(num>0) {
			a[num-1]=fib(num);
			num--;
	}
		System.out.println(Arrays.toString(a));
	}
	
	static int  fib(int num) {
		
		if(num==1) {
			return 0;
		}
		else if(num==2||num==3) {
			return 1;
		}
		else {
			return fib(num-2)+fib(num-1);
		}
	}
}
