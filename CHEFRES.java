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
			int m=sc.nextInt();
			int[][]arr=new int[n][2];
			for(int i=0;i<n;++i)
			{
				for(int j=0;j<2;++j)
				arr[i][j]=sc.nextInt();
			}
			int[]arr2=new int[m];
			for(int i=0;i<m;++i)
			arr2[i]=sc.nextInt();
			int[]arr3=new int[n];
			for(int i=0;i<n;++i)
			{
			    arr3[i]=arr[i][0];
			}
			Arrays.sort(arr3);
			for(int i=0;i<m;++i)
			{
				int nn=0;
				int nnn=0;
				boolean flag1=false;
				while(nn<n)
				{
				    
				 if(arr2[i]>=arr[nn][0] && arr2[i]<arr[nn][1])
					{
					    flag1=true;
						System.out.println("0");
						break;
					}
				if(flag1==true)
				break;
					
						
						++nnn;
						++nn;
					
				}
				if(flag1==false){
				boolean flag=true;
				for(int i1=0;i1<n;++i1){
				if(arr2[i]<arr3[i1])
					{
					    flag=false;
						System.out.println(arr3[i1]-arr2[i]);
						break;
					}}
					if (flag==true)
					System.out.println("-1");
			}}
			
				}
			}
		}
	
