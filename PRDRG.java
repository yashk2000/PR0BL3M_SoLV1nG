import java.util.*;
class PRDRG
{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();

    int[]arr2=new int[25];int[]arr3=new int[25];arr3[0]=2;
    arr2[0]=1;
    for(int i=1;i<25;++i)
    {
      if(i%2==0)
      arr2[i]=arr2[i-1]*2 +1;
      else
      arr2[i]=arr2[i-1]*2 -1;
      arr3[i]=(int)Math.pow(2,i+1);
    }
    for(int i=1;i<=t;++i)
    {
      int n=sc.nextInt();
      System.out.print(arr2[n-1]+" "+arr3[n-1]+" ");
    }
  }
}
