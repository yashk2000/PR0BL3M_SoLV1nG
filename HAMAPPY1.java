import java.util.*;
class HAMAPPY1{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int q=sc.nextInt();
    int k=sc.nextInt();
    int[]arr=new int[n];
    for(int i=0;i<n;++i)
    arr[i]=sc.nextInt();
    String s=sc.nextLine();
    s=sc.nextLine();
    for(int i=0;i<q;++i)
    {
      char ch=s.charAt(i);
      if(ch=='!')
      {
        int tmp=arr[n-1];
        for(int u=n-1;u>0;)
        {
          arr[u]=arr[--u];
        }
        arr[0]=tmp;

      }
      else
      {
        int c=0;
        int max=0;
        for(int u=0;u<n;++u)
        {
          if(arr[u]==0)
          {
            c=0;
          }
          else
          {
            ++c;
            if(c>max)
            max=c;

          }
        }
        if(max<=k)
        System.out.println(max);
        else
        System.out.println(k);
      }
    }
  }
}
