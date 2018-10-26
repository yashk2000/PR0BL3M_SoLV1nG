import java.util.*;
public class solution
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		
		int[]arr=new int[n];
		
		
		int c=0;
		
		for(int i=0;i<n;++i)
		{
			arr[i]=sc.nextInt();
					}
		
		int tmp=arr[k-1];
		
		for(int i=0;i<n;++i)
		{
			if(arr[i]>=tmp && arr[i]>0)
			{
				c++;
			}			
		}		
		System.out.println(c);
		
		
	}
}
