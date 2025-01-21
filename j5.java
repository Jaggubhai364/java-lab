import java.util.Scanner;
public class j5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        switch (x) {
            case 1:
                String M = Integer.toHexString(y);
                System.out.println(M);
                break;
            case 2:
                String n = Integer.toBinaryString(y);
                System.out.println(n);
                break;
            default:
                break;
        }

        sc.close();
    }
}
