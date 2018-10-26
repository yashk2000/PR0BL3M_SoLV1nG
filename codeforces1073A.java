import java.util.*;
public class solution
{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    int n=Integer.parseInt(s);
    String w=sc.nextLine();
    boolean flag=true;
    for(int i=0;i<n-1;++i)
    {
      if(w.charAt(i)!=w.charAt(i+1))
      {
        System.out.println("YES\n"+w.substring(i,i+2));
        flag=false;
        break;
      }
    }
    if(flag==true)
    System.out.println("NO");
  }
}
