import java.util.*;
class solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int ii=0;ii<t;++ii)
        {
            int n=sc.nextInt();
            int x=0,y=0,z=0;
            for(int i=0;i<n;++i)
            {
                int tmp=sc.nextInt();
                if(tmp==1)
                ++x;
                else if(tmp==-1)
                ++y;
                else if(tmp!=0)
                ++z;

            }
            if(n == 1)
            System.out.println("yes");
            else if(z>1)
            System.out.println("no");
            else if(y>0 && z>0)
            System.out.println("no");
            else if(y>1 && x==0)
            System.out.println("no");
            else
            System.out.println("yes");
        }
    }
}
