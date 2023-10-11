package verymuchinterested;

public class FirstMaxAndSecondMax
{
	public static void main(String[] args) 
	{
		int[] arr= {1,6,5,3,9,8,2};
		int fmax=0;
		int smax=0;
		for(int x:arr)
		{
			if(x>fmax)
			{
				smax=fmax;
				fmax=x;
			}
			else if(x>smax)
			{
				smax=x;
			}
		}
		System.out.println(fmax);
		System.out.println(smax);
	}

}
