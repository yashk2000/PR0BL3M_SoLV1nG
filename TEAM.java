import java.util.*;
public class solution 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=0,s=0;
        int[]arr=new int[3];
        int[]arr2=new int[1001];
        for(int i=0;i<n;++i)
        {
            for(int j=0;j<3;++j)
            {
                arr[j]=sc.nextInt();
                s=arr[0]+arr[1]+arr[2];
            }
            arr2[i]=s;
                if(arr2[i]>=2)
                    ++c;
        }
        System.out.println(c);
    }
}
