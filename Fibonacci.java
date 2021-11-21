package myownjavaprac;
import java.util.*;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n+1];
        if (n <= 1) {
            System.out.println(n);
        } else {
            arr[0] = 0;
            arr[1] = 1;
            for(int i = 2;i <= n;i++) {
                arr[i] = arr[i-1] + arr[i-2];

            }
            System.out.println(arr[n]);
        }

    }
}
