import java.util.Scanner;
public class solution {
	

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		double n = sc.nextDouble();
		double m = sc.nextDouble();
		double a = sc.nextDouble();
		double width=Math.ceil(n/a);
		double breadth= Math.ceil(m/a);
		System.out.println((long)(width*breadth));		
	}


}
