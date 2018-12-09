import java.util.*;
class solution
{
   public static void main(String[]args)
   {
       Scanner sc=new Scanner(System.in);
       int t=sc.nextInt();
       for(int i=0;i<t;++i)
       {
           int n=sc.nextInt();
           int x=sc.nextInt();
           int s=sc.nextInt();
           int[]arr=new int[n];
           arr[x-1]=-1;
           for(int j=0;j<s;++j)
           {
              int t1=sc.nextInt();
              int t2=sc.nextInt();;
              int tmp=arr[t1-1];
              arr[t1-1]=arr[t2-1];
              arr[t2-1]=tmp;
		  }
		  for(int j=0;j<n;++j)
		  {
			  if(arr[j]==-1)
			  {
				  System.out.println((j+1));
				  break;
			  }
		  }
	  }
  }
}
			
