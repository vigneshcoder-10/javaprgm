package verymuchinterested;

public class primecheck {
	public static void main(String[] args) {
	int num=100;
	int pcount=0,ncount=0;
		for(int i=1;i<=num;i++) {
			 int count=0;
			for(int j=i;j>=1;j--) {
				if(i%j==0) {
					count++;
				if(count>2) 
					break;
			}
			}
			if(count==2) {
				System.out.println(i+" is a prime ");
				pcount++;
			}
			else 
			{
				System.out.println(i +" it is not prime ");
				ncount++;
			}
		}
			System.out.println("it is prime count "+ pcount);
			System.out.println("it is not prime count "+ ncount);
		
	}
	}


		