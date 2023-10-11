package mayukh;

import java.util.Arrays;
import java.util.Scanner;

public class NinputOnlyEven {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter N number");
		int a=s.nextInt();
		int a1[] =new int[a];
		for(int i=0;i<a;i++) {
			System.out.println("Enter " + (i+1) +" input");
			
			a1[i]=s.nextInt();
		}
		s.close();          
		System.out.println("------------------------------");
           System.out.println("        Even Array values       ");
           System.out.println("------------------------------");
    for(int p:a1) {
    	if(p%2==0) {
    		System.out.println("             "+p);
    	}
    }
    System.out.println("------------------------------");
	}

}
