import java.util.*;
class CHHAPPY
{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    for(int ii=0;ii<t;++ii)
    {
      int n=sc.nextInt();
      int[]arr=new int[n+1];
      int[]arr2=new int[n+1];
      for(int i=1;i<=n;++i){
      arr[i]=sc.nextInt();arr2[arr[i]]++;}
      boolean flag=true;
      outer : for(int i=1;i<=n;++i)
      {
        if(arr2[i]>1){int c=-1;
          int[]arr3=new int[arr2[i]];
          for(int j=1;j<=n;++j)
          {
            if(arr[j]==i)
            arr3[++c]=j;
          }
          int h=0;
          for(int m=0;m<=c;++m)
          {
            if(arr2[arr3[m]+1]>=1)
            ++h;
            if(h==2){
              System.out.println("Truly Happy");
              flag=false;
              break outer;
            }
          }
      }
    }
  if(flag)
  System.out.println("Poor Chef");
}
}
}
