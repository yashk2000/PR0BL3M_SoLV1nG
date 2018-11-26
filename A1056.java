import java.util.*;
public class A1056{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();--n;
    int tr=sc.nextInt();
    int[]arr=new int[tr];
    //Arrays.sort(arr);
    for(int i=0;i<tr;++i)
    arr[i]=sc.nextInt();
    //System.out.println(n);
    for(int ii=0;ii<n;++ii){
      ArrayList<Integer> klants = new ArrayList<Integer>();
      int tr1=sc.nextInt();

      for(int i=0;i<tr1;++i){
        //arr1[i]=sc.nextInt();
      int temp=sc.nextInt();klants.add(temp);}
      Collections.sort(klants);
      for(int i=0;i<tr;++i)
      {
        if(Collections.binarySearch(klants,arr[i])<0) arr[i]=0;
      }

          }
          for(int i=0;i<tr;++i)
          {
            if(arr[i]!=0)
            System.out.print(arr[i]+" ");
          }
          System.out.println();
  }
}
