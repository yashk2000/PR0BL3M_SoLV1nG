import java.util.*;
class soultion
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int ii=0;ii<t;++ii)
		{
			int n=sc.nextInt();;
			int[]arrr=new int[n];
			int[]arr=new int[n];
			for(int i=0;i<n;++i)
			arr[i]=sc.nextInt();
			for(int i=0;i<=n/2;++i)
			arrr[i]=i+1;
			for(int i=n-1;i>n/2;--i)
			arrr[i]=n-i;
			boolean flag=true;
			for(int i=0;i<n;++i)
			{
				if(arr[i]==arrr[i])
				continue;
				else
				{
					flag=false;
					break;
				}
			}
			if(flag==false)
			System.out.println("no");
			else
			System.out.println("yes");
		}
	}
}
