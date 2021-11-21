package myownjavaprac;
import java.util.Scanner;

public class LCM {
    private static long gcd_naive(long a, long b) {
        if (b == 0) {
            return a;
        } else {
            long rem = a % b;
            return gcd_naive(b, rem);
        }
    }

    private static long lcm_naive(long a,long b) {
        long lcm = 1;
        if (a > 0 & b > 0) {
            lcm = (a*b)/gcd_naive(a,b);
        }
        return lcm;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextInt();
        long b = scanner.nextInt();

        System.out.println(lcm_naive(a, b));
    }
}
