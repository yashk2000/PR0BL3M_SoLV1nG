import java.util.*;
class solution{

public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int t1 = sc.nextInt();
    for(int y=0;y<t1;++y)
    {


        int n=sc.nextInt();
        int m=sc.nextInt();
        int k=sc.nextInt();
        int l=sc.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;++i)
        arr[i]=sc.nextInt();
        Arrays.sort(arr);
        int p=m;
        int t=l*(m+1);
        int tt=t;
        int i=0;
        for(int w=1; w<=k; ++w)
        {
            int flag=0;
            if(w%l==0)
            {
                --p;
                ++flag;
            }
            if(i<n && arr[i]==w && flag==1)
            {
                 tt=l*(p+1);
                 if(tt<t)
                 t=tt;
                 ++p;
                 tt=tt+l;
                 ++i;
            }
            else if(i<n && arr[i]==w)
            {
                 tt=l*(p)+l-(w%l);
                 if(tt<t)
                 t=tt;
                 ++p;
                 tt=tt+l;
                 ++i;
            }
            else if(flag==1)
            {
                 tt=l*(p+1);
                 if(tt<t)
                 t=tt;
            }
            else
            {
                tt=(tt)-1;
                if(tt<t)
                t=tt;
            }


        }
        System.out.println(t);

    }
}}
