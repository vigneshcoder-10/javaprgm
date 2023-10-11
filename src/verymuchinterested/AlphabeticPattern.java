package verymuchinterested;

import java.util.Scanner;

public class AlphabeticPattern 
{

	public static void main(String[] args)
	{ 
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Your Name:");
		String s1=s.nextLine().toLowerCase();
		for(int i=0;i<s1.length();i++) {

			switch(s1.charAt(i)) 
			{
			case 'a':
				patternA();
				try
				{
					Thread.sleep(1000);
				} 
				catch (InterruptedException e)
				{

					e.printStackTrace();
				}
				break;
			case 'b':
				patternB();
				try
				{
					Thread.sleep(1000);
				} 
				catch (InterruptedException e)
				{

					e.printStackTrace();
				}
				break;
			case 'c':
				patternC();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {

					e.printStackTrace();
				}
				break;

			case 'd':
				patternD();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {

					e.printStackTrace();
				}
				break;
			case 'e':
				patternE();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {

					e.printStackTrace();
				}
				break;
			case 'f':
				patternF();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {

					e.printStackTrace();
				}
				break;
			case 'g':
				patternG();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {

					e.printStackTrace();
				}
				break;
			case 'h':
				patternH();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {

					e.printStackTrace();
				}
				break;
			case 'i':
				patternI();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {

					e.printStackTrace();
				}
				break;
			case 'j':
				patternJ();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {

					e.printStackTrace();
				}
				break;
			case 'k':
				patternK();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {

					e.printStackTrace();
				}
				break;
			case 'l':
				patternL();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {

					e.printStackTrace();
				}
				break;
			case 'm':
				patternM();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {

					e.printStackTrace();
				}
				break;
			case 'n':
				patternN();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {

					e.printStackTrace();
				}
				break;
			case 'o':
				patternO();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {

					e.printStackTrace();
				}
				break;
			case 'p':
				patternP();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {

					e.printStackTrace();
				}
				break;
			case 'q':
				patternQ();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {

					e.printStackTrace();
				}
				break;
			case 'r':
				patternR();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {

					e.printStackTrace();
				}
				break;
			case 's':
				patternS();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {

					e.printStackTrace();
				}
				break;
			case 't':
				patternT();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {

					e.printStackTrace();
				}
				break;
			case 'u':
				patternU();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {

					e.printStackTrace();
				}
				break;
			case 'v':
				patternV();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {

					e.printStackTrace();
				}
				break;
			case 'w':
				patternW();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {

					e.printStackTrace();
				}
				break;
			case 'x':
				patternC();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {

					e.printStackTrace();
				}
				break;
			case 'y':
				patternY();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {

					e.printStackTrace();
				}
				break;
			case 'z':
				patternZ();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {

					e.printStackTrace();
				}
				break;
			}

			//patternA();
			//patternB();
			//patternC();
			//patternD();
			//patternE();
			//patternF();
			//patternG();
			//patternH();
			//patternI();
			//patternJ();
			//patternK();
			//patternL();
			//patternM();
			//patternN();
			//patternO();
			//patternP();
			//patternQ();
			//patternR();
			//patternS();
			//patternT();
			//patternU();
			//patternV();
			//patternW();
			//patternX();
			//patternY();
			//patternZ();
		}
		System.out.println();
		System.out.println();
	}

	private static void patternQ() {
		int n=9;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==0&&j!=n-1&&j!=0||j==0&&i!=n-2&&i!=n-1&&i!=0||i==n-2&&j!=0&&j!=n-1&&j!=n-3||j==n-1&&i!=0&&i!=n-1&&i!=n-2||i==j&&i>n/2) {
					System.out.print("* ");
				}
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
	private static void patternW() {
		int n=9;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(j==0||i+j==n-1&&i>=n/2||i==j&&i>n/2||j==n-1) {
					System.out.print("* ");
				}
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
	private static void patternZ() {
		int n=9;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==0||i+j==n-1||i==n-1) {
					System.out.print("* ");
				}
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
	private static void patternX() {
		int n=9;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i+j==n-1||i==j) {
					System.out.print("* ");
				}
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
	private static void patternP() {
		int n=9;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(j==0||i==0&&j!=n-1||i==n/2&&j!=n-1||j==n-1&&i<n/2&&i!=0&&i!=n/2) {
					System.out.print("* ");
				}
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
	private static void patternO() {
		int n=9;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==0&&j!=0&&j!=n-1||j==0&&i!=0&&i!=n-1||i==n-1&&j!=0&&j!=n-1||j==n-1&&i!=0&&i!=n-1) {
					System.out.print("* ");
				}
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
	private static void patternU() 
	{
		int n=9;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(j==0&&i!=n-1||i==n-1&&j!=0&&j!=n-1||j==n-1&&i!=n-1)
				{
					System.out.print("* ");
				}
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
	private static void patternG() 
	{
		int n=9;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {

				if(i==0&&j!=0||j==0&&i!=0&&i!=n-1
						||i==n-1&&j!=0&&j<=n/2
						||j==n/2&&i>=n/2&&i!=n/2
						||i==n/2&&j>n/2&&j!=n-1
						||j==n-1&&i>n/2&&i!=n/2) 
				{
					System.out.print("* ");
				}
				else
					System.out.print("  ");
			}
			System.out.println();

		}
	}

	private static void patternB() 
	{
		int n=9;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(j==0||i==0&&j!=n-1||i==n/2&&j!=n-1||i==n-1&&j!=n-1||j==n-1&&i!=0&&i!=n/2&&i!=n-1)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	private static void patternA() 
	{
		int n=9;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(j==0&&i!=0||i==0&&j!=n-1&&j!=0||i==n/2||j==n-1&&i!=0) {
					System.out.print("* ");
				}
				else
					System.out.print("  ");
			}
			System.out.println();
		}	}

	private static void patternC()
	{
		int n=9;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==0&&j!=0||j==0&&i!=0&&i!=n-1||i==n-1&&j!=0) {
					System.out.print("* ");
				}
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
	private static void patternD() 
	{
		int n=9;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {

				if(i==0&&j!=n-1||j==0||i==n-1&&j!=n-1||j==n-1&&i!=0&&i!=n-1) {
					System.out.print("* ");
				}
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
	private static void patternE() {
		int n=9;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {

				if(i==0||j==0||i==n/2||i==n-1) {
					System.out.print("*");
				}
				else
					System.out.print(" ");
			}
			System.out.println();

		}
	}
	private static void patternF() {
		int n=9;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==0||j==0||i==n/2) {
					System.out.print("*");
				}
				else 
					System.out.print(" ");
			}
			System.out.println();
		}

	}
	private static void patternH() {

		int n=9;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {

				if(j==0||j==n-1||i==n/2) {
					System.out.print("h ");
				}
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
	private static void patternI() {
		int n=9;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) 
			{
				if(i==0||j==n/2||i==n-1) 
				{
					System.out.print("i");
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}	 

	}
	private static void patternJ() {
		int n=9;
		for(int i=0;i<n;i++) {

			for(int j=0;j<n;j++) {

				if(i==0||j==n/2||i==n-1&&j<=n/2) {
					System.out.print("* ");
				}
				else
					System.out.print("  ");
			}
			System.out.println();

		}		 
	}
	private static void patternK() {
		int n=9;

		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(j==n/2||(i+j==n-1&&i<n/2)||i>n/2&&i==j){
					System.out.print("* ");
				}
				else
					System.out.print("  ");
			}
			System.out.println();
		}

	}
	private static void patternR() {
		int n=9;

		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if((i==0&&j!=n-1||j==0)||i==n/2&&j!=n-1||j==n-1&&i<n/2&&i!=0||i>=n/2&&i==j){
					System.out.print("* ");
				}
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
	private static void patternN() {
		int n=9;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {

				if(j==0||i==j||j==n-1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}	
			}
			System.out.println();
		}      	
	}
	private static void patternL() {


		int n=9;

		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==n-1||j==0) {
					System.out.print("* "); 
				}

				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	private static void patternM() {

		int n=9;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==j&&i<n/2||j==0||i+j==n-1&&i<n/2||j==n-1||i==n/2&&j==n/2)
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	private static void patternY() {

		int  n=9;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i<n/2&&i==j||i+j==n-1&&i<=n/2||j==n/2&&i>n/2) {
					System.out.print("* ");
				}
				else
					System.out.print("  ");
			}
			System.out.println();
		} 			 
	}
	private static void patternT() {  		 


		int n=9;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==0||j==n/2) {
					System.out.print("* ");
				}
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
	private static void patternS() {

		int n=9;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==0&&j!=0||j==0&&i!=0&&i<n/2||i==n/2&&j!=0&&j!=n-1||(j==n-1&&i>n/2&&i!=n/2&&i!=n-1)||i==n-1&&j!=0&&j!=n-1) {
					System.out.print("* ");
				}
				else
					System.out.print("  ");
			}
			System.out.println();
		}

	}
	private static void patternV() {

		int n=9;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==j&&i<=n/2||i+j==n-1&&i<n/2) {
					System.out.print("*");
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}