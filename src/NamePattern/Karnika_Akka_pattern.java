package NamePattern;

public class Karnika_Akka_pattern {

	public static void main(String[] args) {
		
		karnikaAkka(7);
		
	}
   private static void karnikaAkka(int n) {
	   for(int i=0;i<n;i++) {
  			for(int j=0;j<n;j++) {
  			if(j==n/2||(i+j==n-1&&i<n/2)||i>n/2&&i==j){
  				System.out.print("$ ");
  			}
  			else
  				System.out.print("  ");
  			}
  			
  		System.out.print("  ");
  		
  		
  		for(int j=0;j<n;j++) {
			if(j==0&&i!=0||i==0&&j!=n-1&&j!=0||i==n/2||j==n-1&&i!=0) {
				System.out.print("@ ");
			}
			else
				System.out.print("  ");
		}
		System.out.print("  ");
		
  		

 			 for(int j=0;j<n;j++) {
 				 if((i==0&&j!=n-1||j==0)||i==n/2&&j!=n-1||j==n-1&&i<n/2&&i!=0||i>=n/2&&i==j){
 					 System.out.print("^ ");
 				 }
 				 else
 					 System.out.print("  ");
 			 }
 			 System.out.print("  ");
 			
 	  		
 		 
  			for(int j=0;j<n;j++) {
  				
  			if(j==0||i==j||j==n-1) {
  				System.out.print("*");
  			}
  			else {
  				System.out.print(" ");
  			}	
  			}
  			System.out.print("  ");
  			
  	  		
 			 for(int j=0;j<n;j++) {
 				 if(i==0||j==n/2||i==n-1) {
 					 System.out.print("i");
 				 }
 				 else
 					 System.out.print(" ");
 			 }
 			 System.out.print("");
 			
 	  		
 		
 			for(int j=0;j<n;j++) {
 			if(j==n/2||(i+j==n-1&&i<n/2)||i>n/2&&i==j){
 				System.out.print("$ ");
 			}
 			else
 				System.out.print("  ");
 			}
 			
 			System.out.print("  ");
 			
 	  		
 			for(int j=0;j<n;j++) {
				if(j==0&&i!=0||i==0&&j!=n-1&&j!=0||i==n/2||j==n-1&&i!=0) {
					System.out.print("@ ");
				}
				else
					System.out.print("  ");
			
			}
			System.out.print("   ");
			
	  		
      System.out.println();
      try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	   }
	 
	   
	   System.out.println();
	   for(int i=0;i<n;i++) {
		   for(int j=0;j<n;j++) {
	 			if(j==n/2||(i+j==n-1&&i<n/2)||i>n/2&&i==j){
	 				System.out.print("  ");
	 			}
	 			else
	 				System.out.print("  ");
		   }
		   for(int j=0;j<n;j++) {
	 			if(j==n/2||(i+j==n-1&&i<n/2)||i>n/2&&i==j){
	 				System.out.print("  ");
	 			}
	 			else
	 				System.out.print("  ");
		   }
	 			System.out.print("  ");
 			 for(int j=0;j<n;j++) {
 				 if(i==j&&i<n/2||j==0||i+j==n-1&&i<n/2||j==n-1||i==n/2&&j==n/2)
 				 {
 					 System.out.print("M ");
 				 }
 				 else {
 					 System.out.print("  ");
 				 }
   }
 			 System.out.print("  ");
 			for(int j=0;j<n;j++) {
				if(j==0&&i!=0||i==0&&j!=n-1&&j!=0||i==n/2||j==n-1&&i!=0) {
					System.out.print("@ ");
				}
				else
					System.out.print("  ");
			
			}
			System.out.print("   ");
			 for(int j=0;j<n;j++) {
 				 if(i==j&&i<n/2||j==0||i+j==n-1&&i<n/2||j==n-1||i==n/2&&j==n/2)
 				 {
 					 System.out.print("M ");
 				 }
 				 else {
 					 System.out.print("  ");
 				 }
			 }
			 
 			 System.out.println();
 			 try {
 				Thread.sleep(500);
 			} catch (InterruptedException e) {
 				
 				e.printStackTrace();
 			}

}
}}