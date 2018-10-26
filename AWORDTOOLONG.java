import java.util.Scanner;
public class solution
{
	public static void main(String args[])
	{
	    Scanner sc=new Scanner(System.in);
		int length=sc.nextInt();
		String s="";
		for(int i=0;i<=length;i++)
		{
			s=sc.nextLine();
			if(s.length() > 10)
			{
				System.out.print(s.charAt(0));
				System.out.print(s.length() -2); 
				System.out.println(s.charAt(s.length() -1));
			}
			else
				System.out.println(s);
			
		}
	}


}
