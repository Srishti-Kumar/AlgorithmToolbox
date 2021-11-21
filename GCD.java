package myownjavaprac;

import java.util.Scanner;

public class GCD {
    private static long gcd_naive(long a, long b) {
        if (b == 0) {
            return a;
        } else {
            long rem = a % b;
            return gcd_naive(b, rem);
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextInt();
        long b = scanner.nextInt();

        System.out.println(gcd_naive(a, b));
    }
}

