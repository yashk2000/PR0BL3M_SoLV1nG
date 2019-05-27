import java.util.*;
public class A{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]arr = new int[26];
        String s = sc.nextLine();
        for(int i = 0; i < n; ++i) {
            s = sc.nextLine();
            arr[s.charAt(0) - 97]++;
        }
        int sum = 0;
        for(int i=0;i<26;++i){
            if(arr[i]%2==0 && arr[i]!=0){
                int x=arr[i]/2;
                int y=x-1;
                sum+=x*y;
                //System.out.println(arr[i]);
            } else if(arr[i]==1){
                sum+=0;
                } else if(arr[i]==3){
                    sum+=1;
                    }else {
                int x=arr[i]/2;
                int xx=x-1;
                int y=x+1;
                int yy=y-1;
                sum+=(x*xx)/2;
                sum+=(y*yy)/2;
            }
        }
        System.out.println(sum);
    }
}
