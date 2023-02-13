import java.util.Scanner;
public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean f = true;
        for(int i = 2; i < n; i++) {
            if (n % i == 0) {
                f = false;
                break;
            }
        }
        if (f) System.out.println("Простое");
        else System.out.println("Составное");
    }
}
