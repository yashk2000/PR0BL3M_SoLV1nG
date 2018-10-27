import java.util.*;
class solition
{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    for(int ii=0;ii<t;++ii)
    {
      int n=sc.nextInt();
      int k=sc.nextInt();
      int[]arr=new int[n];int[]ar=sc.nextInt();
      for(int i=0;i<n;++i){
      arr[i]=sc.nextInt();}//ar[i]=arr[i];}
      Arrays.sort(arr);int tmp=n-1;
      while(k>0)
      {
        arr[tmp]=1;
        --k;
        --tmp;
      }
      int sum2=0;int sum=0;
      for(int i=0;i<n;++i)
      {
        sum2+=arr[i]*arr[i];
        sum+=arr[i];
      }
      if(sum2<=sum)
      System.out.println("YES");
      else
      System.out.println("NO");
    }
  }
}
