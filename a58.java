import java.util.Scanner;
public class a58 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int l = s.length();
        if (l == 5) {
            if(s.equals("hello"))
                System.out.println("YES");
            else
                System.out.println("NO");
        } else {
            int[]arr = new int[5];
            arr[0] = s.indexOf('h');
            arr[1] = s.indexOf('e', arr[0] + 1);
            arr[2] = s.indexOf('l', arr[1] + 1);
            arr[3] = s.indexOf('l', arr[2] + 1);
            arr[4] = s.indexOf('o', arr[3] + 1);
            
            if ((arr[0] != -1 && arr[1] != -1 && arr[2] != -1 && arr[3] != -1 && arr[4] != -1) && (arr[0] < arr[1] && arr[1] < arr[2] && arr[2] < arr[3] && arr[3] < arr[4]))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
