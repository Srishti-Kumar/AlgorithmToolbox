package myownjavaprac;

import java.util.*;
import java.io.*;

public class MaxPairwiseProduct {
    static long getMaxPairwiseProduct(int[] numbers) {
        //long max_product = 0;
        long product = 0;
        int n = numbers.length;

        Arrays.sort(numbers);
        long largest = numbers[n-1];
        long secLargest = numbers[n-2];

        product = largest * secLargest;
        return product;
    }

//        for (int first = 0; first < n; ++first) {
//            for (int second = first + 1; second < n; ++second) {
//                max_product = Math.max(max_product,
//                        (long) numbers[first] * numbers[second]);
//            }
//        }
//
//        return max_product;

 //   }

    public static void main(String[] args) {
        FastScanner scanner = new FastScanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.println(getMaxPairwiseProduct(numbers));
    }

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(InputStream stream) {
            try {
                br = new BufferedReader(new
                        InputStreamReader(stream));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }

}
