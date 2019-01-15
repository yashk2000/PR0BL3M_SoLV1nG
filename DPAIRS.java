import java.util.*;
class DPAIRS{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    int[]a=new int[n];
    int[]b=new int[m];
    a[0]=sc.nextInt();
    int max=a[0];
    int max_index=0;
    for(int i=1;i<n;++i){
      a[i]=sc.nextInt();
      if(a[i]>max){
      max=a[i];
      max_index=i;
    }
    }
    b[0]=sc.nextInt();
    int min=b[0];
    int min_index=0;
    for(int i=1;i<m;++i){
      b[i]=sc.nextInt();
      if(b[i]<min){
        min_index=i;
      min=b[i];
    }
    }
    for(int i=0;i<n;++i)
    System.out.println(i+" "+min_index);
    for(int i=0;i<m;++i)
    {
      if(i!=min_index)
      System.out.println(max_index+" "+i);
    }
  }
}
