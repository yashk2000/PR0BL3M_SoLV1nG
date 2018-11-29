import java.util.*;
class solution
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int ii=0;ii<t;++ii)
		{
			int n=sc.nextInt();
			int[][]arr=new int[n][2];
			for(int i=0;i<n;++i)
			{
				for(int j=0;j<2;++j)
				arr[i][j]=sc.nextInt();
			}
			int c=0;
			for(int i=0;i<n;++i)
			{
			   if((arr[i][1]-arr[i][0])>5) ++c;
		}
		System.out.println(c);}
	}}
