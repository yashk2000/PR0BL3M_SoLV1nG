import java.util.*;
class HP18{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int t = sc.nextInt();
    for(int i=0;i<t;++i){
      int n=sc.nextInt();
      int a=sc.nextInt();
      int b=sc.nextInt();
      int[]arr=new int[n];
      int sa=0;
      int sb=0;
      for(int ii=0;ii<n;++ii){
        arr[ii]=sc.nextInt();
        if(arr[ii]%a==0)
        ++sa;
        if(arr[ii]%b==0)
        ++sb;
      }
      if(a==b){
        if(sa>0)
        System.out.println("BOB");
        else
        System.out.println("ALICE");
      }
      else{
        if(sa>sb)
        System.out.println("BOB");
        else
        System.out.println("ALICE");
      }
    }
  }
}
