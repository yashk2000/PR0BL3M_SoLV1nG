import java.util.*;
public class A{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        String s = sc.nextLine();
        s = sc.nextLine();
        int c = 0;
        for (int i = n - x; i < n; i++) {
            if (i == n - y - 1) {
                if (s.charAt(i) != '1') {
                    c++;
                }
            } else if (s.charAt(i) != '0') {
                c++;
            }
        }
        System.out.println(c);
    }
}
