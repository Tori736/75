import java.util.Scanner;
public class Task10 {
    enum N {
        I(1), IV(4), V(5), IX(9), X(10), XL(40), L(50), XC(90), C(100);
        int k;
        N (int k) {
            this.k = k;
        }
    }
    public static String td(int a) {
        if (a <= 0) {
            throw new IllegalArgumentException();
        }
        StringBuilder buf = new StringBuilder();
        final N[] values = N.values();
        for (int i = values.length - 1; i >= 0; i--) {
            while (a >= values[i].k) {
                buf.append(values[i]);
                a -= values[i].k;
            }
        }
        return buf.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(td(a));
    }
}
