import java.util.*;
public class solution  {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String ss=sc.nextLine();
		String s1=s.toLowerCase();
		String s2=ss.toLowerCase();
		int flag=0;
		for (int i=0;i<s1.length();i++)
			if (s1.charAt(i)==s2.charAt(i))
				continue;
			else if (s1.charAt(i)<s2.charAt(i)) {
				flag=-1;
				break;
			} 
			else {
				flag=1;
				break;
			}
		System.out.println(flag);
		

	}
}
