import java.util.*;
public class solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=0;
        String a="++X";
        String b="X++";
        String[]arr=new String[n];
        for(int i=0;i<n;i++)
        {
            String tmp=sc.next();
            arr[i]=tmp;
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i].equals(a) || arr[i].equals(b))
                x++;
            else
                x--;
        }
        System.out.println(x);
    }
}
