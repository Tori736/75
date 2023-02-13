import java.util.Scanner;
public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 1, b = 1, k, f;
        System.out.print(a + " " + b +" ");
        for (int i = 0; i < n - 3; i++) {
            f = a + b;
            a = b;
            b = f;
            System.out.print(f + " ");
        }
    }
}
