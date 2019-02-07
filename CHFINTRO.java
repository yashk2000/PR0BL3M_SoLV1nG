import java.util.*;
class CHFINTRO{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int N=sc.nextInt();
    int r=sc.nextInt();
    for(int i=0;i<N;++i){
      int t=sc.nextInt();
      if(t>=r)
      System.out.println("Good boi");
      else
      System.out.println("Bad boi");
    }
  }
}
