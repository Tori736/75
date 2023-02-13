import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int k = 0, s = a;
        while (a != 0) {
            k = k * 10 + s % 10;
            a /= 10;
        }
        if (k == s)
            System.out.println("Палиндром");
        else
            System.out.println("Не палиндром");
    }
}
