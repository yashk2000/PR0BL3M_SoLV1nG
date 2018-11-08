import java.util.*;
class pf
{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    for(int i=2;i<=n;){
      if(n%i==0){
        System.out.println(i);
        n/=i;
      }
      else
      ++i;
    }
  }
}
