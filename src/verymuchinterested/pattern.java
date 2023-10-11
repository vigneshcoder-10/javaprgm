package verymuchinterested;

import java.util.Arrays;

public class pattern {

	public static void main(String[] args) {
	int rows =5;
	for(int i=1;i<=rows;i++) {
		for(int j=1;j<=i;j++) {
			System.out.print("* ");
		}
		System.out.println();
	}
	for(int z=1;z<=rows;z++) {
		for(int k=rows-z;k>=1;k--) {
			System.out.print("* ");
		}
		System.out.println();
	}
		}
	}


