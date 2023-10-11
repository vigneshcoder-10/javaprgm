package verymuchinterested;

public class FiirstLargeArray {

	public static void main(String[] args) {
		int[] a1= {2,4,5,9,78,54,21,34,99};
		int fmax=0;
		for(int i=0;i<a1.length;i++)
		{
			if(a1[i]>fmax)
			{
				fmax=a1[i];
			}
		}
		System.out.println(fmax);
	}

}
