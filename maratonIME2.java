import java.util.*;
public class maratonIME
{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[]arr=new int[n];
    for(int i=0;i<n;++i)
    arr[i]=sc.nextInt();
    long sum1=0;
    long sum2=0;
    for (int x : arr){
        sum1+=sum2*x;
        sum2+=x;}
    System.out.println(sum1);
  }
}
