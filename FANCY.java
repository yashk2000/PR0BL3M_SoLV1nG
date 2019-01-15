import java.util.*;
class FANCY{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    for(int i=0;i<t;++i){
      String s = sc.nextLine();
      if(i==0)
      s=sc.nextLine();
      String[]words=s.split(" ");
      boolean b=true;
      for(String word:words){
        if(word.equals("not")){
          System.out.println("Real Fancy");
          b=false;
          break;
        }
      }
      if(b==true){
        System.out.println("regularly fancy");
      }
    }
  }
}
