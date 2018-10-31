import java.util.*;
public class maratonIME
{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    long[]arr=new long[n];
    for(int i=0;i<n;++i)
    arr[i]=sc.nextLong();
    long sum=0;
    for (int i=0;i<n;++i)
    sum+=arr[i];
    long sum2=sum*sum;
    long tmp=0;
    for (int i=0;i<n;++i)
    tmp+=arr[i]*arr[i];
    System.out.println((sum2-tmp)/2);
  }
}
