package verymuchinterested;

import java.util.Scanner;

public class occurenceall {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a Occurence: ");
		
		String s1=s.nextLine();
		int SmallCharCount=0;
		int LargeCharCount=0;
		int NumberCount=0;
		int SpecialCharCount=0;
		for(int i=0;i<s1.length();i++) {
			
			if(s1.charAt(i)>='A'&&s1.charAt(i)<='Z') {
				LargeCharCount++;
			}
			else if(s1.charAt(i)>='a'&&s1.charAt(i)<='z') {
				SmallCharCount++;
			}
			
			else if(s1.charAt(i)>='1'&&s1.charAt(i)<='9'){
				NumberCount++;
			}
			else {
				SpecialCharCount++;
			}
		}
		System.out.println("Total Characters in a String= "+s1.length());
		System.out.println("Total SmallChar Count= "+SmallCharCount);
		System.out.println("Total Number Count= "+NumberCount);
		System.out.println("Total Special char Count= "+SpecialCharCount);
		System.out.println("Total LargeChar count= "+LargeCharCount);
		s.close();
	}
	
	

}
