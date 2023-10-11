package verymuchinterested;

public class Stringrev 
{

	public static void main(String[] args) 
	{
		
		int[]ch= {1,2,1,3,1,2,5};
		boolean visited[]=new boolean[ch.length];
		
		for(int i=0;i<ch.length;i++)
		{
			if(visited[i]!=true)
			{
				int count=1;
				
				for(int j=i+1;j<ch.length;j++)
				{
					if(ch[i]==ch[j])
					{
						count++;
						visited[j]=true;
					}
				}	
					if(count==1)
					{
						System.out.println(ch[i]);
						
					}
					
				}
				
			}
		}
	}
