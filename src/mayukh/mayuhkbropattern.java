package mayukh;

public class mayuhkbropattern {

	public static void main(String[] args) {
		mayukh(7);

	}
	private static void mayukh(int n) {
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
				 if(i<n/2&&i==j||i+j==n-1&&i<=n/2||j==n/2&&i>n/2) {
					 System.out.print("* ");
				 }
				 else
					 System.out.print("  ");
			 }
			 System.out.print("  ");
			 for(int j=0;j<n;j++)
				{
					if(j==0&&i!=n-1||i==n-1&&j!=0&&j!=n-1||j==n-1&&i!=n-1)
					{
						System.out.print("* ");
					}
					else
						System.out.print("  ");
				}
				System.out.print("  ");
				for(int j=0;j<n;j++) {
		  			if(j==n/2||(i+j==n-1&&i<n/2)||i>n/2&&i==j){
		  				System.out.print("$ ");
		  			}
		  			else
		  				System.out.print("  ");
		  			}
		  			
		  		System.out.print("  ");
		  		for(int j=0;j<n;j++) {
	       			
       				if(j==0||j==n-1||i==n/2) {
       					System.err.print("$ ");
       				}
       				else
       					System.out.print("  ");
       			}
       			System.out.print("  ");
       			System.out.println();
//       			try {
//       				Thread.sleep(500);
//       			} catch (InterruptedException e) {
//       				
//       				e.printStackTrace();
//       			}
       		}
		 }
	}

