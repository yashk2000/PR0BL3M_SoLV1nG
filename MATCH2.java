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
			int q=sc.nextInt();;
			int[]arr1=new int[n];
			int[]arr2=new int[n];
			for(int i=0;i<n;++i)
			arr1[i]=sc.nextInt();
			for(int i=0;i<n;++i)
			arr2[i]=sc.nextInt();
			int[][]arr=new int[q][3];
			for(int i=0;i<q;++i)
			{
				for(int j=0;j<3;++j)
				arr[i][j]=sc.nextInt();
			}
			
		    
			for(int iii=0;iii<q;++iii)
			{int p=0;
			    for(int i=0;i<n;++i)
			{
				if(arr1[i]==arr2[i])
				++p;
			}
				int l=arr[iii][0]^p;
				int r=arr[iii][1]^p;
				int c=arr[iii][2]^p;
				--l;--r;
	
			
				for(int i=l;i<=r;++i)
				arr1[i]=c;
				int tmp=0;
				for(int i=0;i<n;++i)
			{
				if(arr1[i]==arr2[i])
				++tmp;
			}
			System.out.println(tmp);}
		
	}
}
}

				
