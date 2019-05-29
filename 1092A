import java.util.*;
public class A{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;++i){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int f=a/b;
            String s="";
            for(int j=0;j<b;++j){
                for(int jj=0;jj<f;++jj)
                s=s+(char)(j+'a');
            }
            if(s.length()<a){
                int c=0;
                while(s.length()<a){
                    s=s+(char)(c+'a');
                    ++c;
                }
            }
            System.out.println(s);
        }
    }
}
