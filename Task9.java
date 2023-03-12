import java.util.Scanner;
public class Task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        double d = (b*b)-4*a*c;
        float k = 0, s = 0;
        if (d == 0) {
            k = -1*(b/(2*a));
            System.out.println("Уравнеие имеет 1 квадратный корень, равный "+k);
        } else {
            if (d > 0) {
                k = ((-1*b) + (float)Math.sqrt(d))/(2*a);
                s = ((-1*b) - (float)Math.sqrt(d))/(2*a);
                System.out.println("Уравнение имеет 2 квадратных корня: "+k+" и " +s);
            } else {
                System.out.println("Уравнение не имеет квадратных корней");
            }
        }
    }
}